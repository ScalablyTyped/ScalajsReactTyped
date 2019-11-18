
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
        val angular__common = "org.gulliblytyped.japgolly" % "angular__common_sjs0.6_2.12" % "8.2.14-7c9dcc"
        val angular__compiler = "org.gulliblytyped.japgolly" % "angular__compiler_sjs0.6_2.12" % "8.2.14-d4da15"
        val angular__core = "org.gulliblytyped.japgolly" % "angular__core_sjs0.6_2.12" % "8.2.14-13d179"
        val angular__forms = "org.gulliblytyped.japgolly" % "angular__forms_sjs0.6_2.12" % "8.2.14-bc78e3"
        val `angular__platform-browser` = "org.gulliblytyped.japgolly" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-387b4b"
        val `angular__platform-browser-dynamic` = "org.gulliblytyped.japgolly" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-489266"
        val angular__router = "org.gulliblytyped.japgolly" % "angular__router_sjs0.6_2.12" % "8.2.14-a2d98f"
        val `ant-design__create-react-context` = "org.gulliblytyped.japgolly" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-9d71f9"
        val antd = "org.gulliblytyped.japgolly" % "antd_sjs0.6_2.12" % "3.25.1-e1c7d7"
        val axios = "org.gulliblytyped.japgolly" % "axios_sjs0.6_2.12" % "0.19.0-53aad7"
      }
      object B {
        val `body-parser` = "org.gulliblytyped.japgolly" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-41229d"
      }
      object C {
        val chart_dot_js = "org.gulliblytyped.japgolly" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191113Z-9189df"
        val classnames = "org.gulliblytyped.japgolly" % "classnames_sjs0.6_2.12" % "2.2-dt-20190702Z-b9eaba"
        val connect = "org.gulliblytyped.japgolly" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-841515"
        val `core-js` = "org.gulliblytyped.japgolly" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-b24cff"
        val csstype = "org.gulliblytyped.japgolly" % "csstype_sjs0.6_2.12" % "2.6.6-5023da"
      }
      object D {
        val d3 = "org.gulliblytyped.japgolly" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-00cc5d"
        val `d3-array` = "org.gulliblytyped.japgolly" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-eafc81"
        val `d3-axis` = "org.gulliblytyped.japgolly" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-9aec85"
        val `d3-brush` = "org.gulliblytyped.japgolly" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-8fc01a"
        val `d3-chord` = "org.gulliblytyped.japgolly" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-ab2d33"
        val `d3-collection` = "org.gulliblytyped.japgolly" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-27ccb7"
        val `d3-color` = "org.gulliblytyped.japgolly" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-cea481"
        val `d3-contour` = "org.gulliblytyped.japgolly" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-36dfae"
        val `d3-dispatch` = "org.gulliblytyped.japgolly" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-5dc9fd"
        val `d3-drag` = "org.gulliblytyped.japgolly" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-ef1dd9"
        val `d3-dsv` = "org.gulliblytyped.japgolly" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-a24e64"
        val `d3-ease` = "org.gulliblytyped.japgolly" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-a9b75d"
        val `d3-fetch` = "org.gulliblytyped.japgolly" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-e1d009"
        val `d3-force` = "org.gulliblytyped.japgolly" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-aaba4c"
        val `d3-format` = "org.gulliblytyped.japgolly" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-e7e5b8"
        val `d3-geo` = "org.gulliblytyped.japgolly" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-b530ad"
        val `d3-hierarchy` = "org.gulliblytyped.japgolly" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-67b116"
        val `d3-interpolate` = "org.gulliblytyped.japgolly" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-8b3a22"
        val `d3-path` = "org.gulliblytyped.japgolly" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-3aa22c"
        val `d3-polygon` = "org.gulliblytyped.japgolly" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-421704"
        val `d3-quadtree` = "org.gulliblytyped.japgolly" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-02133a"
        val `d3-random` = "org.gulliblytyped.japgolly" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-c5b5c4"
        val `d3-scale` = "org.gulliblytyped.japgolly" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-37c426"
        val `d3-scale-chromatic` = "org.gulliblytyped.japgolly" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-89ca89"
        val `d3-selection` = "org.gulliblytyped.japgolly" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-069fdc"
        val `d3-shape` = "org.gulliblytyped.japgolly" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-753258"
        val `d3-time` = "org.gulliblytyped.japgolly" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-89661b"
        val `d3-time-format` = "org.gulliblytyped.japgolly" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-d660b3"
        val `d3-timer` = "org.gulliblytyped.japgolly" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-d84639"
        val `d3-transition` = "org.gulliblytyped.japgolly" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-4c0d02"
        val `d3-voronoi` = "org.gulliblytyped.japgolly" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-a60446"
        val `d3-zoom` = "org.gulliblytyped.japgolly" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-55acf5"
      }
      object E {
        val electron = "org.gulliblytyped.japgolly" % "electron_sjs0.6_2.12" % "6.1.4-3ed30e"
        val exenv = "org.gulliblytyped.japgolly" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-c98675"
        val expo = "org.gulliblytyped.japgolly" % "expo_sjs0.6_2.12" % "35.0.1-9aa90f"
        val `expo-asset` = "org.gulliblytyped.japgolly" % "expo-asset_sjs0.6_2.12" % "7.0.0-1db009"
        val `expo-constants` = "org.gulliblytyped.japgolly" % "expo-constants_sjs0.6_2.12" % "7.0.1-d2faf5"
        val `expo-file-system` = "org.gulliblytyped.japgolly" % "expo-file-system_sjs0.6_2.12" % "7.0.0-f83fc4"
        val `expo-font` = "org.gulliblytyped.japgolly" % "expo-font_sjs0.6_2.12" % "7.0.0-05c3c3"
        val `expo-keep-awake` = "org.gulliblytyped.japgolly" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-edd12d"
        val `expo-linear-gradient` = "org.gulliblytyped.japgolly" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-d64999"
        val `expo-location` = "org.gulliblytyped.japgolly" % "expo-location_sjs0.6_2.12" % "7.0.0-e912c1"
        val `expo-permissions` = "org.gulliblytyped.japgolly" % "expo-permissions_sjs0.6_2.12" % "7.0.0-2e16d7"
        val `expo-sqlite` = "org.gulliblytyped.japgolly" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-f2f452"
        val `expo-web-browser` = "org.gulliblytyped.japgolly" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-d5fca5"
        val `expo__vector-icons` = "org.gulliblytyped.japgolly" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-97311f"
        val express = "org.gulliblytyped.japgolly" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-92693e"
        val `express-serve-static-core` = "org.gulliblytyped.japgolly" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20191101Z-c093b6"
        val `extract-zip` = "org.gulliblytyped.japgolly" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-2d98a6"
      }
      object F {
        val fbemitter = "org.gulliblytyped.japgolly" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-c5311a"
        val `fortawesome__fontawesome-common-types` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-414928"
        val `fortawesome__fontawesome-svg-core` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-2b1645"
        val `fortawesome__free-solid-svg-icons` = "org.gulliblytyped.japgolly" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-774895"
        val `fortawesome__react-fontawesome` = "org.gulliblytyped.japgolly" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-ad03fa"
      }
      object G {
        val geojson = "org.gulliblytyped.japgolly" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-9aa3c6"
        val googlemaps = "org.gulliblytyped.japgolly" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191018Z-aba02f"
      }
      object H {
        val highlight_dot_js = "org.gulliblytyped.japgolly" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-cf7a40"
        val history = "org.gulliblytyped.japgolly" % "history_sjs0.6_2.12" % "4.7.2-dt-20190822Z-5f5341"
        val `hoist-non-react-statics` = "org.gulliblytyped.japgolly" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-599b3a"
      }
      object I {
        val `is-buffer` = "org.gulliblytyped.japgolly" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-c36093"
      }
      object J {
        val jquery = "org.gulliblytyped.japgolly" % "jquery_sjs0.6_2.12" % "3.3-dt-20190815Z-ea7864"
        val jqueryui = "org.gulliblytyped.japgolly" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-41a75b"
        val jss = "org.gulliblytyped.japgolly" % "jss_sjs0.6_2.12" % "10.0.0-2e4a7a"
      }
      object L {
        val leaflet = "org.gulliblytyped.japgolly" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-d9e9d7"
        val lodash = "org.gulliblytyped.japgolly" % "lodash_sjs0.6_2.12" % "4.14-dt-20191113Z-7550d0"
      }
      object M {
        val `material-ui` = "org.gulliblytyped.japgolly" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-c2c20c"
        val `material-ui__core` = "org.gulliblytyped.japgolly" % "material-ui__core_sjs0.6_2.12" % "3.9.3-00bb1b"
        val `material-ui__icons` = "org.gulliblytyped.japgolly" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-482887"
        val mime = "org.gulliblytyped.japgolly" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-ef6654"
        val mobx = "org.gulliblytyped.japgolly" % "mobx_sjs0.6_2.12" % "5.14.2-f3a383"
        val `mobx-react` = "org.gulliblytyped.japgolly" % "mobx-react_sjs0.6_2.12" % "6.1.4-513f37"
        val `mobx-react-lite` = "org.gulliblytyped.japgolly" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-04e45d"
        val moment = "org.gulliblytyped.japgolly" % "moment_sjs0.6_2.12" % "2.24.0-0c9aac"
      }
      object N {
        val node = "org.gulliblytyped.japgolly" % "node_sjs0.6_2.12" % "12.12-dt-20191108Z-baf114"
      }
      object O {
        val onsenui = "org.gulliblytyped.japgolly" % "onsenui_sjs0.6_2.12" % "2.10.10-edf2cc"
      }
      object P {
        val p5 = "org.gulliblytyped.japgolly" % "p5_sjs0.6_2.12" % "0.9-dt-20190806Z-13d422"
        val popper_dot_js = "org.gulliblytyped.japgolly" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-e985dc"
        val `prop-types` = "org.gulliblytyped.japgolly" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-2d597e"
      }
      object R {
        val `range-parser` = "org.gulliblytyped.japgolly" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-bf3406"
        val `rc-mentions` = "org.gulliblytyped.japgolly" % "rc-mentions_sjs0.6_2.12" % "0.4.1-81b63e"
        val `rc-menu` = "org.gulliblytyped.japgolly" % "rc-menu_sjs0.6_2.12" % "7.5.3-5e1974"
        val react = "org.gulliblytyped.japgolly" % "react_sjs0.6_2.12" % "16.9-dt-20191025Z-485300"
        val `react-addons-linked-state-mixin` = "org.gulliblytyped.japgolly" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-ec391c"
        val `react-big-calendar` = "org.gulliblytyped.japgolly" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20190923Z-af7e13"
        val `react-dom` = "org.gulliblytyped.japgolly" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191106Z-5650b5"
        val `react-is` = "org.gulliblytyped.japgolly" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-fa4028"
        val `react-lifecycles-compat` = "org.gulliblytyped.japgolly" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-2f29f9"
        val `react-native` = "org.gulliblytyped.japgolly" % "react-native_sjs0.6_2.12" % "0.60-dt-20191028Z-915ef8"
        val `react-native-gesture-handler` = "org.gulliblytyped.japgolly" % "react-native-gesture-handler_sjs0.6_2.12" % "1.5.0-dfbe5a"
        val `react-native-vector-icons` = "org.gulliblytyped.japgolly" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190930Z-bb2221"
        val `react-navigation` = "org.gulliblytyped.japgolly" % "react-navigation_sjs0.6_2.12" % "4.0.10-581b4b"
        val `react-redux` = "org.gulliblytyped.japgolly" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-5be498"
        val `react-router` = "org.gulliblytyped.japgolly" % "react-router_sjs0.6_2.12" % "5.1-dt-20191113Z-f5b82d"
        val `react-router-dom` = "org.gulliblytyped.japgolly" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191101Z-b84886"
        val `react-slick` = "org.gulliblytyped.japgolly" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-99a6a1"
        val `react-transition-group` = "org.gulliblytyped.japgolly" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191002Z-92ed0c"
        val redux = "org.gulliblytyped.japgolly" % "redux_sjs0.6_2.12" % "4.0.4-a9395d"
        val `redux-devtools-extension` = "org.gulliblytyped.japgolly" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-e9419b"
        val reveal = "org.gulliblytyped.japgolly" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-170ceb"
        val rxjs = "org.gulliblytyped.japgolly" % "rxjs_sjs0.6_2.12" % "6.5.3-6bb5e8"
      }
      object S {
        val `semantic-ui-react` = "org.gulliblytyped.japgolly" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-0f33ce"
        val `semantic-ui-react__event-stack` = "org.gulliblytyped.japgolly" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-3f1c16"
        val `serve-static` = "org.gulliblytyped.japgolly" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-535d5f"
        val shallowequal = "org.gulliblytyped.japgolly" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-5b0184"
        val sizzle = "org.gulliblytyped.japgolly" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-37289d"
        val `stardust-ui__react-component-ref` = "org.gulliblytyped.japgolly" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-728dc3"
        val std = "org.gulliblytyped.japgolly" % "std_sjs0.6_2.12" % "3.7-b7faa7"
        val storybook__react = "org.gulliblytyped.japgolly" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190605Z-3df3b2"
        val `styled-components` = "org.gulliblytyped.japgolly" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191109Z-ffa092"
        val `symbol-observable` = "org.gulliblytyped.japgolly" % "symbol-observable_sjs0.6_2.12" % "1.2.0-212c6e"
      }
      object T {
        val three = "org.gulliblytyped.japgolly" % "three_sjs0.6_2.12" % "0.109.0-9b8c12"
        val tslib = "org.gulliblytyped.japgolly" % "tslib_sjs0.6_2.12" % "1.10.0-d626cb"
        val typescript = "org.gulliblytyped.japgolly" % "typescript_sjs0.6_2.12" % "3.7.2-cad749"
      }
      object U {
        val unimodules__core = "org.gulliblytyped.japgolly" % "unimodules__core_sjs0.6_2.12" % "4.0.0-cb3b58"
        val `unimodules__react-native-adapter` = "org.gulliblytyped.japgolly" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-3d2260"
      }
      object V {
        val vue = "org.gulliblytyped.japgolly" % "vue_sjs0.6_2.12" % "2.6.10-f400ca"
      }
      object W {
        val `webpack-env` = "org.gulliblytyped.japgolly" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-099e2e"
      }
      object Y {
        val `yandex-maps` = "org.gulliblytyped.japgolly" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-e77b5a"
      }
      object Z {
        val zone_dot_js = "org.gulliblytyped.japgolly" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-93972c"
      }
    }
  }
}