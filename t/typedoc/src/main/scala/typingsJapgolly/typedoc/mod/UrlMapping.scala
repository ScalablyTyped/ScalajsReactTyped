package typingsJapgolly.typedoc.mod

import typingsJapgolly.typedoc.distLibOutputModelsUrlMappingMod.RenderTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "UrlMapping")
@js.native
open class UrlMapping[Model] protected ()
  extends typingsJapgolly.typedoc.distLibOutputMod.UrlMapping[Model] {
  def this(
    url: String,
    model: Model,
    template: RenderTemplate[typingsJapgolly.typedoc.distLibOutputEventsMod.PageEvent[Model]]
  ) = this()
}
