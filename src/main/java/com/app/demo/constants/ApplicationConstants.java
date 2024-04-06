package com.app.demo.constants;

/**
 * The Application Constants
 *
 * @author Loki
 */
public final class ApplicationConstants {

    private ApplicationConstants() {

    }

    /**
     * the paths class.
     */
    public static final class Paths {

        private Paths() {
            // private constructor.
        }

        public static final String BASE_PATH = "/api/ecommerce";
    }

    public static final class Headers {
        private Headers() {
            // private constructor.
        }

        public static final String CORRELATION_ID = "Correlation_Id";
    }

}
