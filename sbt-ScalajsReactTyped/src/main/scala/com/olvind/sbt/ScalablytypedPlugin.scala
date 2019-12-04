
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
        val angular__animations = "org.gulliblytyped.japgolly" % "angular__animations_sjs0.6_2.12" % "8.2.14-f32062"
        val angular__common = "org.gulliblytyped.japgolly" % "angular__common_sjs0.6_2.12" % "8.2.14-ae3770"
        val angular__compiler = "org.gulliblytyped.japgolly" % "angular__compiler_sjs0.6_2.12" % "8.2.14-5663cd"
        val angular__core = "org.gulliblytyped.japgolly" % "angular__core_sjs0.6_2.12" % "8.2.14-3fb66e"
        val angular__forms = "org.gulliblytyped.japgolly" % "angular__forms_sjs0.6_2.12" % "8.2.14-9db827"
        val `angular__platform-browser` = "org.gulliblytyped.japgolly" % "angular__platform-browser_sjs0.6_2.12" % "8.2.14-d8ec56"
        val `angular__platform-browser-dynamic` = "org.gulliblytyped.japgolly" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "8.2.14-ff29d0"
        val angular__router = "org.gulliblytyped.japgolly" % "angular__router_sjs0.6_2.12" % "8.2.14-d1f85f"
        val `ant-design__create-react-context` = "org.gulliblytyped.japgolly" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-896a97"
        val antd = "org.gulliblytyped.japgolly" % "antd_sjs0.6_2.12" % "3.25.3-121dac"
        val axios = "org.gulliblytyped.japgolly" % "axios_sjs0.6_2.12" % "0.19.0-a501e6"
      }
      object B {
        val `body-parser` = "org.gulliblytyped.japgolly" % "body-parser_sjs0.6_2.12" % "1.17-dt-20190819Z-850c86"
      }
      object C {
        val chart_dot_js = "org.gulliblytyped.japgolly" % "chart_dot_js_sjs0.6_2.12" % "2.9-dt-20191119Z-aa73e9"
        val cheerio = "org.gulliblytyped.japgolly" % "cheerio_sjs0.6_2.12" % "v0.22.0-dt-20191112Z-b523ed"
        val classnames = "org.gulliblytyped.japgolly" % "classnames_sjs0.6_2.12" % "2.2-dt-20191126Z-31c414"
        val connect = "org.gulliblytyped.japgolly" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-6efbf6"
        val `core-js` = "org.gulliblytyped.japgolly" % "core-js_sjs0.6_2.12" % "2.5-dt-20190616Z-a41f48"
        val csstype = "org.gulliblytyped.japgolly" % "csstype_sjs0.6_2.12" % "2.6.6-42c42f"
      }
      object D {
        val d3 = "org.gulliblytyped.japgolly" % "d3_sjs0.6_2.12" % "5.7-dt-20190819Z-fe002e"
        val `d3-array` = "org.gulliblytyped.japgolly" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-f2ca43"
        val `d3-axis` = "org.gulliblytyped.japgolly" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-7f6f2f"
        val `d3-brush` = "org.gulliblytyped.japgolly" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-e14530"
        val `d3-chord` = "org.gulliblytyped.japgolly" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-1bf8ef"
        val `d3-collection` = "org.gulliblytyped.japgolly" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-aa51ad"
        val `d3-color` = "org.gulliblytyped.japgolly" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-4a1688"
        val `d3-contour` = "org.gulliblytyped.japgolly" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-a500a6"
        val `d3-dispatch` = "org.gulliblytyped.japgolly" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-2af9b1"
        val `d3-drag` = "org.gulliblytyped.japgolly" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-316cbb"
        val `d3-dsv` = "org.gulliblytyped.japgolly" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-00701d"
        val `d3-ease` = "org.gulliblytyped.japgolly" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20191014Z-fa5a92"
        val `d3-fetch` = "org.gulliblytyped.japgolly" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-5c0681"
        val `d3-force` = "org.gulliblytyped.japgolly" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-293c6f"
        val `d3-format` = "org.gulliblytyped.japgolly" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-f85dd9"
        val `d3-geo` = "org.gulliblytyped.japgolly" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-e3d75c"
        val `d3-hierarchy` = "org.gulliblytyped.japgolly" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-81495e"
        val `d3-interpolate` = "org.gulliblytyped.japgolly" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-696d62"
        val `d3-path` = "org.gulliblytyped.japgolly" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-0d2123"
        val `d3-polygon` = "org.gulliblytyped.japgolly" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-7ed76b"
        val `d3-quadtree` = "org.gulliblytyped.japgolly" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-d7f6a2"
        val `d3-random` = "org.gulliblytyped.japgolly" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-7e6668"
        val `d3-scale` = "org.gulliblytyped.japgolly" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-ecb048"
        val `d3-scale-chromatic` = "org.gulliblytyped.japgolly" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-fdc7d4"
        val `d3-selection` = "org.gulliblytyped.japgolly" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190710Z-274fb1"
        val `d3-shape` = "org.gulliblytyped.japgolly" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20191014Z-10e246"
        val `d3-time` = "org.gulliblytyped.japgolly" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-d63bd5"
        val `d3-time-format` = "org.gulliblytyped.japgolly" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-5f7edb"
        val `d3-timer` = "org.gulliblytyped.japgolly" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-7ec633"
        val `d3-transition` = "org.gulliblytyped.japgolly" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20191029Z-f14b11"
        val `d3-voronoi` = "org.gulliblytyped.japgolly" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-2e112b"
        val `d3-zoom` = "org.gulliblytyped.japgolly" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-ef01d1"
      }
      object E {
        val electron = "org.gulliblytyped.japgolly" % "electron_sjs0.6_2.12" % "6.1.5-8c72b2"
        val `emotion-theming` = "org.gulliblytyped.japgolly" % "emotion-theming_sjs0.6_2.12" % "10.0.19-b58dea"
        val emotion__core = "org.gulliblytyped.japgolly" % "emotion__core_sjs0.6_2.12" % "10.0.20-da01bb"
        val emotion__serialize = "org.gulliblytyped.japgolly" % "emotion__serialize_sjs0.6_2.12" % "0.11.11-75c143"
        val emotion__styled = "org.gulliblytyped.japgolly" % "emotion__styled_sjs0.6_2.12" % "10.0.23-0af10b"
        val `emotion__styled-base` = "org.gulliblytyped.japgolly" % "emotion__styled-base_sjs0.6_2.12" % "10.0.24-3193c7"
        val emotion__utils = "org.gulliblytyped.japgolly" % "emotion__utils_sjs0.6_2.12" % "0.11.2-63ed4b"
        val enzyme = "org.gulliblytyped.japgolly" % "enzyme_sjs0.6_2.12" % "3.10-dt-20190715Z-614e1d"
        val exenv = "org.gulliblytyped.japgolly" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-eb3837"
        val expo = "org.gulliblytyped.japgolly" % "expo_sjs0.6_2.12" % "35.0.1-734996"
        val `expo-asset` = "org.gulliblytyped.japgolly" % "expo-asset_sjs0.6_2.12" % "7.0.0-e21f7d"
        val `expo-constants` = "org.gulliblytyped.japgolly" % "expo-constants_sjs0.6_2.12" % "7.0.1-f0bd2d"
        val `expo-file-system` = "org.gulliblytyped.japgolly" % "expo-file-system_sjs0.6_2.12" % "7.0.0-5e4705"
        val `expo-font` = "org.gulliblytyped.japgolly" % "expo-font_sjs0.6_2.12" % "7.0.0-ac1994"
        val `expo-keep-awake` = "org.gulliblytyped.japgolly" % "expo-keep-awake_sjs0.6_2.12" % "7.0.0-b62656"
        val `expo-linear-gradient` = "org.gulliblytyped.japgolly" % "expo-linear-gradient_sjs0.6_2.12" % "7.0.1-ee1de7"
        val `expo-location` = "org.gulliblytyped.japgolly" % "expo-location_sjs0.6_2.12" % "7.0.0-70ee4b"
        val `expo-permissions` = "org.gulliblytyped.japgolly" % "expo-permissions_sjs0.6_2.12" % "7.0.0-47d82e"
        val `expo-sqlite` = "org.gulliblytyped.japgolly" % "expo-sqlite_sjs0.6_2.12" % "7.0.0-5f4d03"
        val `expo-web-browser` = "org.gulliblytyped.japgolly" % "expo-web-browser_sjs0.6_2.12" % "7.0.1-89f948"
        val `expo__vector-icons` = "org.gulliblytyped.japgolly" % "expo__vector-icons_sjs0.6_2.12" % "9.0-dt-20190213Z-de9314"
        val express = "org.gulliblytyped.japgolly" % "express_sjs0.6_2.12" % "4.17-dt-20191101Z-85a9b4"
        val `express-serve-static-core` = "org.gulliblytyped.japgolly" % "express-serve-static-core_sjs0.6_2.12" % "4.17-dt-20191115Z-b062ae"
        val `extract-zip` = "org.gulliblytyped.japgolly" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-47aa38"
      }
      object F {
        val fbemitter = "org.gulliblytyped.japgolly" % "fbemitter_sjs0.6_2.12" % "2.0.0-dt-20190503Z-1ca0ad"
        val `fortawesome__fontawesome-common-types` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-common-types_sjs0.6_2.12" % "0.2.25-48185d"
        val `fortawesome__fontawesome-svg-core` = "org.gulliblytyped.japgolly" % "fortawesome__fontawesome-svg-core_sjs0.6_2.12" % "1.2.25-5e5e88"
        val `fortawesome__free-solid-svg-icons` = "org.gulliblytyped.japgolly" % "fortawesome__free-solid-svg-icons_sjs0.6_2.12" % "5.11.2-c5df81"
        val `fortawesome__react-fontawesome` = "org.gulliblytyped.japgolly" % "fortawesome__react-fontawesome_sjs0.6_2.12" % "0.1.7-535411"
      }
      object G {
        val geojson = "org.gulliblytyped.japgolly" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190925Z-87e0cf"
        val googlemaps = "org.gulliblytyped.japgolly" % "googlemaps_sjs0.6_2.12" % "3.38-dt-20191126Z-29073d"
      }
      object H {
        val highlight_dot_js = "org.gulliblytyped.japgolly" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-e1587c"
        val history = "org.gulliblytyped.japgolly" % "history_sjs0.6_2.12" % "4.7.2-dt-20191126Z-a1dd63"
        val `hoist-non-react-statics` = "org.gulliblytyped.japgolly" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-366486"
      }
      object I {
        val inquirer = "org.gulliblytyped.japgolly" % "inquirer_sjs0.6_2.12" % "6.5-dt-20190731Z-eb2a45"
        val `is-buffer` = "org.gulliblytyped.japgolly" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-ef3b13"
      }
      object J {
        val jquery = "org.gulliblytyped.japgolly" % "jquery_sjs0.6_2.12" % "3.3-dt-20191126Z-91c8fc"
        val jqueryui = "org.gulliblytyped.japgolly" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20191104Z-9fedf4"
        val jss = "org.gulliblytyped.japgolly" % "jss_sjs0.6_2.12" % "10.0.0-1aadb7"
      }
      object L {
        val leaflet = "org.gulliblytyped.japgolly" % "leaflet_sjs0.6_2.12" % "1.5-dt-20191022Z-b92aef"
        val lodash = "org.gulliblytyped.japgolly" % "lodash_sjs0.6_2.12" % "4.14-dt-20191126Z-5345cf"
      }
      object M {
        val `material-ui` = "org.gulliblytyped.japgolly" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190815Z-7e8429"
        val `material-ui__core` = "org.gulliblytyped.japgolly" % "material-ui__core_sjs0.6_2.12" % "3.9.3-b908b0"
        val `material-ui__icons` = "org.gulliblytyped.japgolly" % "material-ui__icons_sjs0.6_2.12" % "4.5.1-64a0cc"
        val mime = "org.gulliblytyped.japgolly" % "mime_sjs0.6_2.12" % "2.0-dt-20191126Z-4d22ae"
        val mobx = "org.gulliblytyped.japgolly" % "mobx_sjs0.6_2.12" % "5.15.0-2ace16"
        val `mobx-react` = "org.gulliblytyped.japgolly" % "mobx-react_sjs0.6_2.12" % "6.1.4-be4158"
        val `mobx-react-lite` = "org.gulliblytyped.japgolly" % "mobx-react-lite_sjs0.6_2.12" % "1.5.0-d8fd10"
        val moment = "org.gulliblytyped.japgolly" % "moment_sjs0.6_2.12" % "2.24.0-05fc6b"
      }
      object N {
        val node = "org.gulliblytyped.japgolly" % "node_sjs0.6_2.12" % "12.12-dt-20191126Z-fec8d2"
      }
      object O {
        val onsenui = "org.gulliblytyped.japgolly" % "onsenui_sjs0.6_2.12" % "2.10.10-ce2212"
      }
      object P {
        val p5 = "org.gulliblytyped.japgolly" % "p5_sjs0.6_2.12" % "0.9-dt-20191126Z-e9f744"
        val popper_dot_js = "org.gulliblytyped.japgolly" % "popper_dot_js_sjs0.6_2.12" % "1.16.0-ebcaf5"
        val `prop-types` = "org.gulliblytyped.japgolly" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190924Z-56dadc"
      }
      object R {
        val `range-parser` = "org.gulliblytyped.japgolly" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-0c72b1"
        val `rc-mentions` = "org.gulliblytyped.japgolly" % "rc-mentions_sjs0.6_2.12" % "0.4.1-bd598f"
        val `rc-menu` = "org.gulliblytyped.japgolly" % "rc-menu_sjs0.6_2.12" % "7.5.3-78ceb6"
        val reach__router = "org.gulliblytyped.japgolly" % "reach__router_sjs0.6_2.12" % "1.2-dt-20191009Z-bb20a0"
        val react = "org.gulliblytyped.japgolly" % "react_sjs0.6_2.12" % "16.9-dt-20191126Z-082653"
        val `react-addons-linked-state-mixin` = "org.gulliblytyped.japgolly" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-c9bd6f"
        val `react-big-calendar` = "org.gulliblytyped.japgolly" % "react-big-calendar_sjs0.6_2.12" % "0.22-dt-20191126Z-42bbe4"
        val `react-dom` = "org.gulliblytyped.japgolly" % "react-dom_sjs0.6_2.12" % "16.9-dt-20191126Z-b9ef2d"
        val `react-is` = "org.gulliblytyped.japgolly" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-6528d8"
        val `react-lifecycles-compat` = "org.gulliblytyped.japgolly" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-a8e236"
        val `react-native` = "org.gulliblytyped.japgolly" % "react-native_sjs0.6_2.12" % "0.60-dt-20191121Z-c756b0"
        val `react-native-gesture-handler` = "org.gulliblytyped.japgolly" % "react-native-gesture-handler_sjs0.6_2.12" % "1.5.1-0f5384"
        val `react-native-vector-icons` = "org.gulliblytyped.japgolly" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20191126Z-9d5408"
        val `react-native-view-shot` = "org.gulliblytyped.japgolly" % "react-native-view-shot_sjs0.6_2.12" % "2.6.0-a533ba"
        val `react-navigation` = "org.gulliblytyped.japgolly" % "react-navigation_sjs0.6_2.12" % "4.0.10-4da780"
        val `react-navigation-drawer` = "org.gulliblytyped.japgolly" % "react-navigation-drawer_sjs0.6_2.12" % "2.3.3-c4f3ef"
        val `react-navigation-stack` = "org.gulliblytyped.japgolly" % "react-navigation-stack_sjs0.6_2.12" % "1.10.3-7a159e"
        val `react-redux` = "org.gulliblytyped.japgolly" % "react-redux_sjs0.6_2.12" % "7.1-dt-20191018Z-1b455e"
        val `react-router` = "org.gulliblytyped.japgolly" % "react-router_sjs0.6_2.12" % "5.1-dt-20191126Z-68c4f9"
        val `react-router-dom` = "org.gulliblytyped.japgolly" % "react-router-dom_sjs0.6_2.12" % "5.1-dt-20191125Z-373350"
        val `react-slick` = "org.gulliblytyped.japgolly" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-9a5637"
        val `react-transition-group` = "org.gulliblytyped.japgolly" % "react-transition-group_sjs0.6_2.12" % "4.2-dt-20191126Z-e661be"
        val redux = "org.gulliblytyped.japgolly" % "redux_sjs0.6_2.12" % "4.0.4-5bcd3a"
        val `redux-devtools-extension` = "org.gulliblytyped.japgolly" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-ca8d9f"
        val reveal = "org.gulliblytyped.japgolly" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-256416"
        val rxjs = "org.gulliblytyped.japgolly" % "rxjs_sjs0.6_2.12" % "6.5.3-1605a1"
        val `rxjs-compat` = "org.gulliblytyped.japgolly" % "rxjs-compat_sjs0.6_2.12" % "6.5.3-d48513"
      }
      object S {
        val `semantic-ui-react` = "org.gulliblytyped.japgolly" % "semantic-ui-react_sjs0.6_2.12" % "0.88.1-e5be4e"
        val `semantic-ui-react__event-stack` = "org.gulliblytyped.japgolly" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-df311b"
        val `serve-static` = "org.gulliblytyped.japgolly" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190819Z-b5e0da"
        val shallowequal = "org.gulliblytyped.japgolly" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-7bcff4"
        val sizzle = "org.gulliblytyped.japgolly" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-810239"
        val `stardust-ui__react-component-ref` = "org.gulliblytyped.japgolly" % "stardust-ui__react-component-ref_sjs0.6_2.12" % "0.38.0-6421aa"
        val std = "org.gulliblytyped.japgolly" % "std_sjs0.6_2.12" % "3.7-ed3398"
        val storybook__addons = "org.gulliblytyped.japgolly" % "storybook__addons_sjs0.6_2.12" % "5.2.6-304d8e"
        val storybook__api = "org.gulliblytyped.japgolly" % "storybook__api_sjs0.6_2.12" % "5.2.6-70fda6"
        val storybook__channels = "org.gulliblytyped.japgolly" % "storybook__channels_sjs0.6_2.12" % "5.2.6-7e08ca"
        val storybook__react = "org.gulliblytyped.japgolly" % "storybook__react_sjs0.6_2.12" % "5.2.6-dab8ac"
        val storybook__theming = "org.gulliblytyped.japgolly" % "storybook__theming_sjs0.6_2.12" % "5.2.6-14a02b"
        val `styled-components` = "org.gulliblytyped.japgolly" % "styled-components_sjs0.6_2.12" % "4.4-dt-20191126Z-7a8bbb"
        val `symbol-observable` = "org.gulliblytyped.japgolly" % "symbol-observable_sjs0.6_2.12" % "1.2.0-65e409"
      }
      object T {
        val three = "org.gulliblytyped.japgolly" % "three_sjs0.6_2.12" % "0.109.0-b012e5"
        val through = "org.gulliblytyped.japgolly" % "through_sjs0.6_2.12" % "0.0-unknown-dt-20190322Z-aa144b"
        val tslib = "org.gulliblytyped.japgolly" % "tslib_sjs0.6_2.12" % "1.10.0-636dc1"
        val typescript = "org.gulliblytyped.japgolly" % "typescript_sjs0.6_2.12" % "3.7.2-5daf6b"
      }
      object U {
        val unimodules__core = "org.gulliblytyped.japgolly" % "unimodules__core_sjs0.6_2.12" % "4.0.0-d90cb1"
        val `unimodules__react-native-adapter` = "org.gulliblytyped.japgolly" % "unimodules__react-native-adapter_sjs0.6_2.12" % "4.0.0-c36c8e"
      }
      object V {
        val vue = "org.gulliblytyped.japgolly" % "vue_sjs0.6_2.12" % "2.6.10-39493f"
      }
      object W {
        val `webpack-env` = "org.gulliblytyped.japgolly" % "webpack-env_sjs0.6_2.12" % "1.14-dt-20191014Z-0a051a"
      }
      object Y {
        val `yandex-maps` = "org.gulliblytyped.japgolly" % "yandex-maps_sjs0.6_2.12" % "2.1-dt-20190719Z-c2b850"
      }
      object Z {
        val zone_dot_js = "org.gulliblytyped.japgolly" % "zone_dot_js_sjs0.6_2.12" % "0.10.2-e37f11"
      }
    }
  }
}