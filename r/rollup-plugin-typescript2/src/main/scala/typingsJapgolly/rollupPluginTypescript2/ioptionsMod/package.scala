package typingsJapgolly.rollupPluginTypescript2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioptionsMod {
  type TransformerFactoryCreator = js.Function1[
    /* ls */ typingsJapgolly.typescript.mod.LanguageService, 
    typingsJapgolly.typescript.mod.CustomTransformers | typingsJapgolly.rollupPluginTypescript2.ioptionsMod.ICustomTransformer
  ]
}
