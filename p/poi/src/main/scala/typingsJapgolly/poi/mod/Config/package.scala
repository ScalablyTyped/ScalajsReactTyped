package typingsJapgolly.poi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Config {
  type ChainWebpack = js.Function2[
    /* config */ typingsJapgolly.webpackChain.mod.^, 
    /* opts */ typingsJapgolly.poi.mod.Opts, 
    scala.Unit
  ]
  type ConfigureWebpack = typingsJapgolly.webpack.mod.Configuration | (js.Function2[
    /* config */ typingsJapgolly.webpack.mod.Configuration, 
    /* opts */ typingsJapgolly.poi.mod.Opts, 
    scala.Unit | typingsJapgolly.webpack.mod.Configuration
  ])
  type Constants = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Css = typingsJapgolly.poi.mod.Config.Css_
  type Entry = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | typingsJapgolly.webpack.mod.Entry | typingsJapgolly.webpack.mod.EntryFunc
  ]
  type Envs = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Output = typingsJapgolly.poi.mod.Config.Output_
  type Pages = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsJapgolly.poi.PartialOptionsentrystring]
  type Plugins = js.Array[java.lang.String | typingsJapgolly.poi.mod.Config.PluginOption]
  type PublicFolder = java.lang.String | scala.Boolean
}
