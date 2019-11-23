
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
        val angular__common = "org.gulliblytyped.japgolly" % "angular__common_sjs0.6_2.12" % "8.2.14-a516d4"
        val angular__compiler = "org.gulliblytyped.japgolly" % "angular__compiler_sjs0.6_2.12" % "8.2.14-8a1c11"
        val angular__core = "org.gulliblytyped.japgolly" % "angular__core_sjs0.6_2.12" % "8.2.14-ddae48"
        val angular__forms = "org.gulliblytyped.japgolly" % "angular__forms_sjs0.6_2.12" % "8.2.14-8acb32"
        val `angular__platform-browser` = "org.gulliblytyped.japgolly" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-316225"
        val `angular__platform-browser-dynamic` = "org.gulliblytyped.japgolly" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-016c27"
        val angular__router = "org.gulliblytyped.japgolly" % "angular__router_sjs0.6_2.12" % "8.2.14-baf170"
        val `ant-design__create-react-context` = "org.gulliblytyped.japgolly" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-97029c"
        val antd = "org.gulliblytyped.japgolly" % "antd_sjs0.6_2.12" % "3.25.2-1e6fe9"
        val axios = "org.gulliblytyped.japgolly" % "axios_sjs0.6_2.12" % "0.19.0-40250a"
      }
      object B {
        val `body-parser` = "org.gulliblytyped.japgolly" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-bea960"
      }
      object C {
        val chart_dot_js = "org.gulliblytyped.japgolly" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191119Z-a97c9e"
        val classnames = "org.gulliblytyped.japgolly" % "classnames_sjs0.6_2.12" % "2.2-dt-20190702Z-b24daf"
        val connect = "org.gulliblytyped.japgolly" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-be743f"
        val `core-js` = "org.gulliblytyped.japgolly" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-4c9a97"
        val csstype = "org.gulliblytyped.japgolly" % "csstype_sjs0.6_2.12" % "2.6.6-926676"
      }
      object D {
        val d3 = "org.gulliblytyped.japgolly" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-97674b"
        val `d3-array` = "org.gulliblytyped.japgolly" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-6c496c"
        val `d3-axis` = "org.gulliblytyped.japgolly" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-de9811"
        val `d3-brush` = "org.gulliblytyped.japgolly" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-470a28"
        val `d3-chord` = "org.gulliblytyped.japgolly" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-5c4d2b"
        val `d3-collection` = "org.gulliblytyped.japgolly" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-1becb6"
        val `d3-color` = "org.gulliblytyped.japgolly" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-852063"
        val `d3-contour` = "org.gulliblytyped.japgolly" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-81aefc"
        val `d3-dispatch` = "org.gulliblytyped.japgolly" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-f0f9c0"
        val `d3-drag` = "org.gulliblytyped.japgolly" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-9a5cb2"
        val `d3-dsv` = "org.gulliblytyped.japgolly" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-e4716b"
        val `d3-ease` = "org.gulliblytyped.japgolly" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-fa5a92"
        val `d3-fetch` = "org.gulliblytyped.japgolly" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-8bef6c"
        val `d3-force` = "org.gulliblytyped.japgolly" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-6ae5b6"
        val `d3-format` = "org.gulliblytyped.japgolly" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-9c9940"
        val `d3-geo` = "org.gulliblytyped.japgolly" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-a6d0f7"
        val `d3-hierarchy` = "org.gulliblytyped.japgolly" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-6f96a6"
        val `d3-interpolate` = "org.gulliblytyped.japgolly" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-72e15d"
        val `d3-path` = "org.gulliblytyped.japgolly" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-0d2123"
        val `d3-polygon` = "org.gulliblytyped.japgolly" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-fc892b"
        val `d3-quadtree` = "org.gulliblytyped.japgolly" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-8abbe3"
        val `d3-random` = "org.gulliblytyped.japgolly" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-7e6668"
        val `d3-scale` = "org.gulliblytyped.japgolly" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-687aa3"
        val `d3-scale-chromatic` = "org.gulliblytyped.japgolly" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-655072"
        val `d3-selection` = "org.gulliblytyped.japgolly" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-19adcf"
        val `d3-shape` = "org.gulliblytyped.japgolly" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-4ba9f5"
        val `d3-time` = "org.gulliblytyped.japgolly" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-27c11c"
        val `d3-time-format` = "org.gulliblytyped.japgolly" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-061ba0"
        val `d3-timer` = "org.gulliblytyped.japgolly" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-7ec633"
        val `d3-transition` = "org.gulliblytyped.japgolly" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-e19795"
        val `d3-voronoi` = "org.gulliblytyped.japgolly" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-c5ffa9"
        val `d3-zoom` = "org.gulliblytyped.japgolly" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-52d91a"
      }
      object E {
        val electron = "org.gulliblytyped.japgolly" % "electron_sjs0.6_2.12" % "6.1.5-72c47f"
        val `emotion-theming` = "org.gulliblytyped.japgolly" % "emotion-theming_sjs0.6_2.12" % "10.0.19-283756"
        val emotion__core = "org.gulliblytyped.japgolly" % "emotion__core_sjs0.6_2.12" % "10.0.20-6b6487"
        val emotion__serialize = "org.gulliblytyped.japgolly" % "emotion__serialize_sjs0.6_2.12" % "0.11.11-9cb248"
        val emotion__styled = "org.gulliblytyped.japgolly" % "emotion__styled_sjs0.6_2.12" % "10.0.23-253adf"
        val `emotion__styled-base` = "org.gulliblytyped.japgolly" % "emotion__styled-base_sjs0.6_2.12" % "10.0.24-07dfe8"
        val emotion__utils = "org.gulliblytyped.japgolly" % "emotion__utils_sjs0.6_2.12" % "0.11.2-ee4f75"
        val exenv = "org.gulliblytyped.japgolly" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-eb3837"
        val expo = "org.gulliblytyped.japgolly" % "expo_sjs0.6_2.12" % "35.0.1-4ba738"
        val `expo-asset` = "org.gulliblytyped.japgolly" % "expo-asset_sjs0.6_2.12" % "7.0.0-aa71ba"
        val `expo-constants` = "org.gulliblytyped.japgolly" % "expo-constants_sjs0.6_2.12" % "7.0.1-c9df35"
        val `expo-file-system` = "org.gulliblytyped.japgolly" % "expo-file-system_sjs0.6_2.12" % "7.0.0-5079e3"
        val `expo-font` = "org.gulliblytyped.japgolly" % "expo-font_sjs0.6_2.12" % "7.0.0-525598"
        val `expo-keep-awake` = "org.gulliblytyped.japgolly" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-a9a761"
        val `expo-linear-gradient` = "org.gulliblytyped.japgolly" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-87f22b"
        val `expo-location` = "org.gulliblytyped.japgolly" % "expo-location_sjs0.6_2.12" % "7.0.0-a99903"
        val `expo-permissions` = "org.gulliblytyped.japgolly" % "expo-permissions_sjs0.6_2.12" % "7.0.0-019e82"
        val `expo-sqlite` = "org.gulliblytyped.japgolly" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-8b71ac"
        val `expo-web-browser` = "org.gulliblytyped.japgolly" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-5ce3d3"
        val `expo__vector-icons` = "org.gulliblytyped.japgolly" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-5bee94"
        val express = "org.gulliblytyped.japgolly" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-756383"
        val `express-serve-static-core` = "org.gulliblytyped.japgolly" % "express-serve-static-core_sjs0.6_2.12" % "4.17-dt-20191115Z-c882ef"
        val `extract-zip` = "org.gulliblytyped.japgolly" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-caee05"
      }
      object F {
        val fbemitter = "org.gulliblytyped.japgolly" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-5b0a55"
        val `fortawesome__fontawesome-common-types` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-aeff4d"
        val `fortawesome__fontawesome-svg-core` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-e7887d"
        val `fortawesome__free-solid-svg-icons` = "org.gulliblytyped.japgolly" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-ea44fb"
        val `fortawesome__react-fontawesome` = "org.gulliblytyped.japgolly" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-6baf44"
      }
      object G {
        val geojson = "org.gulliblytyped.japgolly" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-f8c1ad"
        val googlemaps = "org.gulliblytyped.japgolly" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191018Z-81089c"
      }
      object H {
        val highlight_dot_js = "org.gulliblytyped.japgolly" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-8124d2"
        val history = "org.gulliblytyped.japgolly" % "history_sjs0.6_2.12" % "4.7.2-dt-20190822Z-b75265"
        val `hoist-non-react-statics` = "org.gulliblytyped.japgolly" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-b2c6c0"
      }
      object I {
        val `is-buffer` = "org.gulliblytyped.japgolly" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-d50553"
      }
      object J {
        val jquery = "org.gulliblytyped.japgolly" % "jquery_sjs0.6_2.12" % "3.3-dt-20190815Z-7491b6"
        val jqueryui = "org.gulliblytyped.japgolly" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-b5d519"
        val jss = "org.gulliblytyped.japgolly" % "jss_sjs0.6_2.12" % "10.0.0-2386ab"
      }
      object L {
        val leaflet = "org.gulliblytyped.japgolly" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-2d7898"
        val lodash = "org.gulliblytyped.japgolly" % "lodash_sjs0.6_2.12" % "4.14-dt-20191118Z-56d0c0"
      }
      object M {
        val `material-ui` = "org.gulliblytyped.japgolly" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-d38b3a"
        val `material-ui__core` = "org.gulliblytyped.japgolly" % "material-ui__core_sjs0.6_2.12" % "3.9.3-88eed7"
        val `material-ui__icons` = "org.gulliblytyped.japgolly" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-bd61de"
        val mime = "org.gulliblytyped.japgolly" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-fc6f87"
        val mobx = "org.gulliblytyped.japgolly" % "mobx_sjs0.6_2.12" % "5.15.0-89f14b"
        val `mobx-react` = "org.gulliblytyped.japgolly" % "mobx-react_sjs0.6_2.12" % "6.1.4-38e8f4"
        val `mobx-react-lite` = "org.gulliblytyped.japgolly" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-3c8fb6"
        val moment = "org.gulliblytyped.japgolly" % "moment_sjs0.6_2.12" % "2.24.0-14884b"
      }
      object N {
        val node = "org.gulliblytyped.japgolly" % "node_sjs0.6_2.12" % "12.12-dt-20191123Z-b2d3cf"
      }
      object O {
        val onsenui = "org.gulliblytyped.japgolly" % "onsenui_sjs0.6_2.12" % "2.10.10-c3ab6e"
      }
      object P {
        val p5 = "org.gulliblytyped.japgolly" % "p5_sjs0.6_2.12" % "0.9-dt-20190806Z-3936d3"
        val popper_dot_js = "org.gulliblytyped.japgolly" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-bbeb4b"
        val `prop-types` = "org.gulliblytyped.japgolly" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-2e958d"
      }
      object R {
        val `range-parser` = "org.gulliblytyped.japgolly" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-fafbe1"
        val `rc-mentions` = "org.gulliblytyped.japgolly" % "rc-mentions_sjs0.6_2.12" % "0.4.1-de9c30"
        val `rc-menu` = "org.gulliblytyped.japgolly" % "rc-menu_sjs0.6_2.12" % "7.5.3-6d2b9a"
        val reach__router = "org.gulliblytyped.japgolly" % "reach__router_sjs0.6_2.12" % "1.2-dt-20191009Z-fc1edc"
        val react = "org.gulliblytyped.japgolly" % "react_sjs0.6_2.12" % "16.9-dt-20191122Z-580648"
        val `react-addons-linked-state-mixin` = "org.gulliblytyped.japgolly" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-8e55f2"
        val `react-big-calendar` = "org.gulliblytyped.japgolly" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20190923Z-559bc3"
        val `react-dom` = "org.gulliblytyped.japgolly" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191106Z-dcbb48"
        val `react-is` = "org.gulliblytyped.japgolly" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-4f2d04"
        val `react-lifecycles-compat` = "org.gulliblytyped.japgolly" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-1e8d5a"
        val `react-native` = "org.gulliblytyped.japgolly" % "react-native_sjs0.6_2.12" % "0.60-dt-20191121Z-06b8d5"
        val `react-native-gesture-handler` = "org.gulliblytyped.japgolly" % "react-native-gesture-handler_sjs0.6_2.12" % "1.5.1-6682f3"
        val `react-native-vector-icons` = "org.gulliblytyped.japgolly" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190930Z-29420e"
        val `react-navigation` = "org.gulliblytyped.japgolly" % "react-navigation_sjs0.6_2.12" % "4.0.10-755165"
        val `react-redux` = "org.gulliblytyped.japgolly" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-060e39"
        val `react-router` = "org.gulliblytyped.japgolly" % "react-router_sjs0.6_2.12" % "5.1-dt-20191113Z-f36533"
        val `react-router-dom` = "org.gulliblytyped.japgolly" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191101Z-83b879"
        val `react-slick` = "org.gulliblytyped.japgolly" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-06a299"
        val `react-transition-group` = "org.gulliblytyped.japgolly" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191002Z-55f418"
        val redux = "org.gulliblytyped.japgolly" % "redux_sjs0.6_2.12" % "4.0.4-5c07dd"
        val `redux-devtools-extension` = "org.gulliblytyped.japgolly" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-c4360e"
        val reveal = "org.gulliblytyped.japgolly" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-c47da3"
        val rxjs = "org.gulliblytyped.japgolly" % "rxjs_sjs0.6_2.12" % "6.5.3-b05d90"
      }
      object S {
        val `semantic-ui-react` = "org.gulliblytyped.japgolly" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-d9128c"
        val `semantic-ui-react__event-stack` = "org.gulliblytyped.japgolly" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-11779d"
        val `serve-static` = "org.gulliblytyped.japgolly" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-4e0976"
        val shallowequal = "org.gulliblytyped.japgolly" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-7bcff4"
        val sizzle = "org.gulliblytyped.japgolly" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-9323dd"
        val `stardust-ui__react-component-ref` = "org.gulliblytyped.japgolly" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-6d8d42"
        val std = "org.gulliblytyped.japgolly" % "std_sjs0.6_2.12" % "3.7-6f398d"
        val storybook__addons = "org.gulliblytyped.japgolly" % "storybook__addons_sjs0.6_2.12" % "5.2.6-0e6178"
        val storybook__api = "org.gulliblytyped.japgolly" % "storybook__api_sjs0.6_2.12" % "5.2.6-1012b7"
        val storybook__channels = "org.gulliblytyped.japgolly" % "storybook__channels_sjs0.6_2.12" % "5.2.6-d17140"
        val storybook__react = "org.gulliblytyped.japgolly" % "storybook__react_sjs0.6_2.12" % "5.2.6-961e29"
        val storybook__router = "org.gulliblytyped.japgolly" % "storybook__router_sjs0.6_2.12" % "5.2.6-7d1478"
        val storybook__theming = "org.gulliblytyped.japgolly" % "storybook__theming_sjs0.6_2.12" % "5.2.6-ac8727"
        val `styled-components` = "org.gulliblytyped.japgolly" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191109Z-ddfa97"
        val `symbol-observable` = "org.gulliblytyped.japgolly" % "symbol-observable_sjs0.6_2.12" % "1.2.0-65e409"
      }
      object T {
        val three = "org.gulliblytyped.japgolly" % "three_sjs0.6_2.12" % "0.109.0-922d96"
        val tslib = "org.gulliblytyped.japgolly" % "tslib_sjs0.6_2.12" % "1.10.0-313942"
        val typescript = "org.gulliblytyped.japgolly" % "typescript_sjs0.6_2.12" % "3.7.2-de1b2c"
      }
      object U {
        val unimodules__core = "org.gulliblytyped.japgolly" % "unimodules__core_sjs0.6_2.12" % "4.0.0-734425"
        val `unimodules__react-native-adapter` = "org.gulliblytyped.japgolly" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-9c4e21"
      }
      object V {
        val vue = "org.gulliblytyped.japgolly" % "vue_sjs0.6_2.12" % "2.6.10-8fc154"
      }
      object W {
        val `webpack-env` = "org.gulliblytyped.japgolly" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-6780a5"
      }
      object Y {
        val `yandex-maps` = "org.gulliblytyped.japgolly" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-70ceb9"
      }
      object Z {
        val zone_dot_js = "org.gulliblytyped.japgolly" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-81e257"
      }
    }
  }
}