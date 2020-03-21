package typingsJapgolly.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Loader = (js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    js.Promise[typingsJapgolly.cosmiconfig.mod.LoaderResult]
  ]) | typingsJapgolly.cosmiconfig.mod.LoaderSync
  type LoaderResult = typingsJapgolly.cosmiconfig.typesMod.Config | scala.Null
  type LoaderSync = js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    typingsJapgolly.cosmiconfig.mod.LoaderResult
  ]
  type Transform = (js.Function1[
    /* CosmiconfigResult */ typingsJapgolly.cosmiconfig.typesMod.CosmiconfigResult, 
    js.Promise[typingsJapgolly.cosmiconfig.typesMod.CosmiconfigResult]
  ]) | typingsJapgolly.cosmiconfig.mod.TransformSync
  type TransformSync = js.Function1[
    /* CosmiconfigResult */ typingsJapgolly.cosmiconfig.typesMod.CosmiconfigResult, 
    typingsJapgolly.cosmiconfig.typesMod.CosmiconfigResult
  ]
}
