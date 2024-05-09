package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class WatchedAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertWatchedAllPropertiesEquals(Watched expected, Watched actual) {
        assertWatchedAutoGeneratedPropertiesEquals(expected, actual);
        assertWatchedAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertWatchedAllUpdatablePropertiesEquals(Watched expected, Watched actual) {
        assertWatchedUpdatableFieldsEquals(expected, actual);
        assertWatchedUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertWatchedAutoGeneratedPropertiesEquals(Watched expected, Watched actual) {
        assertThat(expected)
            .as("Verify Watched auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertWatchedUpdatableFieldsEquals(Watched expected, Watched actual) {
        assertThat(expected)
            .as("Verify Watched relevant properties")
            .satisfies(e -> assertThat(e.getWatchedAt()).as("check watchedAt").isEqualTo(actual.getWatchedAt()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertWatchedUpdatableRelationshipsEquals(Watched expected, Watched actual) {
        assertThat(expected)
            .as("Verify Watched relationships")
            .satisfies(e -> assertThat(e.getVideo()).as("check video").isEqualTo(actual.getVideo()));
    }
}
