
package org.gulliblytyped.japgolly.sbt

import sbt._
import sbt.Keys._

object ScalajsReactTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  override def globalSettings = List(
    resolvers += Resolver.bintrayRepo("oyvindberg", "ScalajsReactTyped")
  )

  object autoImport {
    object ScalajsReactTyped {
      object A {
        val angular__common = "org.gulliblytyped.japgolly" % "angular__common_sjs0.6_2.12" % "8.2.14-ece8db"
        val angular__compiler = "org.gulliblytyped.japgolly" % "angular__compiler_sjs0.6_2.12" % "8.2.14-592fd0"
        val angular__core = "org.gulliblytyped.japgolly" % "angular__core_sjs0.6_2.12" % "8.2.14-2a283c"
        val angular__forms = "org.gulliblytyped.japgolly" % "angular__forms_sjs0.6_2.12" % "8.2.14-eab73c"
        val `angular__platform-browser` = "org.gulliblytyped.japgolly" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-f83a60"
        val `angular__platform-browser-dynamic` = "org.gulliblytyped.japgolly" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-17c30c"
        val angular__router = "org.gulliblytyped.japgolly" % "angular__router_sjs0.6_2.12" % "8.2.14-7b0af5"
        val `ant-design__create-react-context` = "org.gulliblytyped.japgolly" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-48d0e8"
        val antd = "org.gulliblytyped.japgolly" % "antd_sjs0.6_2.12" % "3.25.1-053e9d"
        val axios = "org.gulliblytyped.japgolly" % "axios_sjs0.6_2.12" % "0.19.0-de1538"
      }
      object B {
        val `body-parser` = "org.gulliblytyped.japgolly" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-8441db"
      }
      object C {
        val chart_dot_js = "org.gulliblytyped.japgolly" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191113Z-9b4e1e"
        val classnames = "org.gulliblytyped.japgolly" % "classnames_sjs0.6_2.12" % "2.2-dt-20190702Z-f07f38"
        val connect = "org.gulliblytyped.japgolly" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-a7fbcd"
        val `core-js` = "org.gulliblytyped.japgolly" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-0a1b5d"
        val csstype = "org.gulliblytyped.japgolly" % "csstype_sjs0.6_2.12" % "2.6.6-f3bc82"
      }
      object D {
        val d3 = "org.gulliblytyped.japgolly" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-38d08b"
        val `d3-array` = "org.gulliblytyped.japgolly" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-d1146f"
        val `d3-axis` = "org.gulliblytyped.japgolly" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-119b31"
        val `d3-brush` = "org.gulliblytyped.japgolly" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-d44c56"
        val `d3-chord` = "org.gulliblytyped.japgolly" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-966927"
        val `d3-collection` = "org.gulliblytyped.japgolly" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-9867bb"
        val `d3-color` = "org.gulliblytyped.japgolly" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-19b9bf"
        val `d3-contour` = "org.gulliblytyped.japgolly" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-894a88"
        val `d3-dispatch` = "org.gulliblytyped.japgolly" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-295a9a"
        val `d3-drag` = "org.gulliblytyped.japgolly" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-edd4a4"
        val `d3-dsv` = "org.gulliblytyped.japgolly" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-790504"
        val `d3-ease` = "org.gulliblytyped.japgolly" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-a9b75d"
        val `d3-fetch` = "org.gulliblytyped.japgolly" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-733af9"
        val `d3-force` = "org.gulliblytyped.japgolly" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-d78f55"
        val `d3-format` = "org.gulliblytyped.japgolly" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-a9f1f6"
        val `d3-geo` = "org.gulliblytyped.japgolly" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-40ca0c"
        val `d3-hierarchy` = "org.gulliblytyped.japgolly" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-96af8a"
        val `d3-interpolate` = "org.gulliblytyped.japgolly" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-ee5b36"
        val `d3-path` = "org.gulliblytyped.japgolly" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-3aa22c"
        val `d3-polygon` = "org.gulliblytyped.japgolly" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-eb6f6b"
        val `d3-quadtree` = "org.gulliblytyped.japgolly" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-b01195"
        val `d3-random` = "org.gulliblytyped.japgolly" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-c5b5c4"
        val `d3-scale` = "org.gulliblytyped.japgolly" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-af54a5"
        val `d3-scale-chromatic` = "org.gulliblytyped.japgolly" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-a6c317"
        val `d3-selection` = "org.gulliblytyped.japgolly" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-55d3a6"
        val `d3-shape` = "org.gulliblytyped.japgolly" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-345df8"
        val `d3-time` = "org.gulliblytyped.japgolly" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-4da047"
        val `d3-time-format` = "org.gulliblytyped.japgolly" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-8c0507"
        val `d3-timer` = "org.gulliblytyped.japgolly" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-d84639"
        val `d3-transition` = "org.gulliblytyped.japgolly" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-19e634"
        val `d3-voronoi` = "org.gulliblytyped.japgolly" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-a440b4"
        val `d3-zoom` = "org.gulliblytyped.japgolly" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-8bdc52"
      }
      object E {
        val electron = "org.gulliblytyped.japgolly" % "electron_sjs0.6_2.12" % "6.1.4-e06823"
        val exenv = "org.gulliblytyped.japgolly" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-c98675"
        val expo = "org.gulliblytyped.japgolly" % "expo_sjs0.6_2.12" % "35.0.1-9b8e31"
        val `expo-asset` = "org.gulliblytyped.japgolly" % "expo-asset_sjs0.6_2.12" % "7.0.0-710981"
        val `expo-constants` = "org.gulliblytyped.japgolly" % "expo-constants_sjs0.6_2.12" % "7.0.1-66f3b8"
        val `expo-file-system` = "org.gulliblytyped.japgolly" % "expo-file-system_sjs0.6_2.12" % "7.0.0-b7092e"
        val `expo-font` = "org.gulliblytyped.japgolly" % "expo-font_sjs0.6_2.12" % "7.0.0-2f6f79"
        val `expo-keep-awake` = "org.gulliblytyped.japgolly" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-4a1973"
        val `expo-linear-gradient` = "org.gulliblytyped.japgolly" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-ef52cf"
        val `expo-location` = "org.gulliblytyped.japgolly" % "expo-location_sjs0.6_2.12" % "7.0.0-2bea05"
        val `expo-permissions` = "org.gulliblytyped.japgolly" % "expo-permissions_sjs0.6_2.12" % "7.0.0-89b3be"
        val `expo-sqlite` = "org.gulliblytyped.japgolly" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-de4a4b"
        val `expo-web-browser` = "org.gulliblytyped.japgolly" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-46e35f"
        val `expo__vector-icons` = "org.gulliblytyped.japgolly" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-3da8ea"
        val express = "org.gulliblytyped.japgolly" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-989aa3"
        val `express-serve-static-core` = "org.gulliblytyped.japgolly" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20191101Z-843e4c"
        val `extract-zip` = "org.gulliblytyped.japgolly" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-1291da"
      }
      object F {
        val fbemitter = "org.gulliblytyped.japgolly" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-206e6c"
        val `fortawesome__fontawesome-common-types` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-2d4af9"
        val `fortawesome__fontawesome-svg-core` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-2dd0f3"
        val `fortawesome__free-solid-svg-icons` = "org.gulliblytyped.japgolly" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-e7c3af"
        val `fortawesome__react-fontawesome` = "org.gulliblytyped.japgolly" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-d707ac"
      }
      object G {
        val geojson = "org.gulliblytyped.japgolly" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-9d5d9f"
        val googlemaps = "org.gulliblytyped.japgolly" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191018Z-542ce3"
      }
      object H {
        val highlight_dot_js = "org.gulliblytyped.japgolly" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-a57fe2"
        val history = "org.gulliblytyped.japgolly" % "history_sjs0.6_2.12" % "4.7.2-dt-20190822Z-d2d5be"
        val `hoist-non-react-statics` = "org.gulliblytyped.japgolly" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-bce0c0"
      }
      object I {
        val `is-buffer` = "org.gulliblytyped.japgolly" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-4728ab"
      }
      object J {
        val jquery = "org.gulliblytyped.japgolly" % "jquery_sjs0.6_2.12" % "3.3-dt-20190815Z-eec8e1"
        val jqueryui = "org.gulliblytyped.japgolly" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-15d53f"
        val jss = "org.gulliblytyped.japgolly" % "jss_sjs0.6_2.12" % "10.0.0-2690a6"
      }
      object L {
        val leaflet = "org.gulliblytyped.japgolly" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-fad98b"
        val lodash = "org.gulliblytyped.japgolly" % "lodash_sjs0.6_2.12" % "4.14-dt-20191113Z-323492"
      }
      object M {
        val `material-ui` = "org.gulliblytyped.japgolly" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-759244"
        val `material-ui__core` = "org.gulliblytyped.japgolly" % "material-ui__core_sjs0.6_2.12" % "3.9.3-380527"
        val `material-ui__icons` = "org.gulliblytyped.japgolly" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-f2d0d4"
        val mime = "org.gulliblytyped.japgolly" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-59d0db"
        val mobx = "org.gulliblytyped.japgolly" % "mobx_sjs0.6_2.12" % "5.14.2-da86f8"
        val `mobx-react` = "org.gulliblytyped.japgolly" % "mobx-react_sjs0.6_2.12" % "6.1.4-d8bf77"
        val `mobx-react-lite` = "org.gulliblytyped.japgolly" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-a50da8"
        val moment = "org.gulliblytyped.japgolly" % "moment_sjs0.6_2.12" % "2.24.0-dcfd2c"
      }
      object N {
        val node = "org.gulliblytyped.japgolly" % "node_sjs0.6_2.12" % "12.12-dt-20191108Z-7fec91"
      }
      object O {
        val onsenui = "org.gulliblytyped.japgolly" % "onsenui_sjs0.6_2.12" % "2.10.10-87f765"
      }
      object P {
        val p5 = "org.gulliblytyped.japgolly" % "p5_sjs0.6_2.12" % "0.9-dt-20190806Z-ed0193"
        val popper_dot_js = "org.gulliblytyped.japgolly" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-576fd7"
        val `prop-types` = "org.gulliblytyped.japgolly" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-090a31"
      }
      object R {
        val `range-parser` = "org.gulliblytyped.japgolly" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-05fc21"
        val `rc-mentions` = "org.gulliblytyped.japgolly" % "rc-mentions_sjs0.6_2.12" % "0.4.1-90f6b4"
        val `rc-menu` = "org.gulliblytyped.japgolly" % "rc-menu_sjs0.6_2.12" % "7.5.3-159a55"
        val react = "org.gulliblytyped.japgolly" % "react_sjs0.6_2.12" % "16.9-dt-20191025Z-992e25"
        val `react-addons-linked-state-mixin` = "org.gulliblytyped.japgolly" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-ab08b8"
        val `react-big-calendar` = "org.gulliblytyped.japgolly" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20190923Z-309c01"
        val `react-dom` = "org.gulliblytyped.japgolly" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191106Z-fa724e"
        val `react-is` = "org.gulliblytyped.japgolly" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-b86d72"
        val `react-lifecycles-compat` = "org.gulliblytyped.japgolly" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-c8c20e"
        val `react-native` = "org.gulliblytyped.japgolly" % "react-native_sjs0.6_2.12" % "0.60-dt-20191028Z-229ecc"
        val `react-native-gesture-handler` = "org.gulliblytyped.japgolly" % "react-native-gesture-handler_sjs0.6_2.12" % "1.5.0-42d461"
        val `react-native-vector-icons` = "org.gulliblytyped.japgolly" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190930Z-3285d6"
        val `react-navigation` = "org.gulliblytyped.japgolly" % "react-navigation_sjs0.6_2.12" % "4.0.10-2844f1"
        val `react-redux` = "org.gulliblytyped.japgolly" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-5d91d7"
        val `react-router` = "org.gulliblytyped.japgolly" % "react-router_sjs0.6_2.12" % "5.1-dt-20191113Z-774179"
        val `react-router-dom` = "org.gulliblytyped.japgolly" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191101Z-54919b"
        val `react-slick` = "org.gulliblytyped.japgolly" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-337406"
        val `react-transition-group` = "org.gulliblytyped.japgolly" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191002Z-1fa3f1"
        val redux = "org.gulliblytyped.japgolly" % "redux_sjs0.6_2.12" % "4.0.4-30f8e5"
        val `redux-devtools-extension` = "org.gulliblytyped.japgolly" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-ae62b4"
        val reveal = "org.gulliblytyped.japgolly" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-4d8e4c"
        val rxjs = "org.gulliblytyped.japgolly" % "rxjs_sjs0.6_2.12" % "6.5.3-085add"
      }
      object S {
        val `semantic-ui-react` = "org.gulliblytyped.japgolly" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-5f2035"
        val `semantic-ui-react__event-stack` = "org.gulliblytyped.japgolly" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-73894f"
        val `serve-static` = "org.gulliblytyped.japgolly" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-154b0a"
        val shallowequal = "org.gulliblytyped.japgolly" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-5b0184"
        val sizzle = "org.gulliblytyped.japgolly" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-cc98e9"
        val `stardust-ui__react-component-ref` = "org.gulliblytyped.japgolly" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-01b586"
        val std = "org.gulliblytyped.japgolly" % "std_sjs0.6_2.12" % "3.7-c9d0d4"
        val storybook__react = "org.gulliblytyped.japgolly" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190605Z-30c9fe"
        val `styled-components` = "org.gulliblytyped.japgolly" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191109Z-82bd07"
        val `symbol-observable` = "org.gulliblytyped.japgolly" % "symbol-observable_sjs0.6_2.12" % "1.2.0-212c6e"
      }
      object T {
        val three = "org.gulliblytyped.japgolly" % "three_sjs0.6_2.12" % "0.109.0-81ef66"
        val tslib = "org.gulliblytyped.japgolly" % "tslib_sjs0.6_2.12" % "1.10.0-50953f"
        val typescript = "org.gulliblytyped.japgolly" % "typescript_sjs0.6_2.12" % "3.7.2-a3a7eb"
      }
      object U {
        val unimodules__core = "org.gulliblytyped.japgolly" % "unimodules__core_sjs0.6_2.12" % "4.0.0-758b62"
        val `unimodules__react-native-adapter` = "org.gulliblytyped.japgolly" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-844590"
      }
      object V {
        val vue = "org.gulliblytyped.japgolly" % "vue_sjs0.6_2.12" % "2.6.10-aca977"
      }
      object W {
        val `webpack-env` = "org.gulliblytyped.japgolly" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-d4d00a"
      }
      object Y {
        val `yandex-maps` = "org.gulliblytyped.japgolly" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-c748b8"
      }
      object Z {
        val zone_dot_js = "org.gulliblytyped.japgolly" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-e9f24e"
      }
    }
  }
}