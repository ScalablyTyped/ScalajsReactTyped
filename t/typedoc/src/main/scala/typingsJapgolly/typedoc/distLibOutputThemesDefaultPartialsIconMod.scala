package typingsJapgolly.typedoc

import typingsJapgolly.std.Record
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import typingsJapgolly.typedoc.typedocStrings.anchor
import typingsJapgolly.typedoc.typedocStrings.checkbox
import typingsJapgolly.typedoc.typedocStrings.chevronDown
import typingsJapgolly.typedoc.typedocStrings.chevronSmall
import typingsJapgolly.typedoc.typedocStrings.menu
import typingsJapgolly.typedoc.typedocStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultPartialsIconMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearSeenIconCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSeenIconCache")().asInstanceOf[Unit]
  
  @JSImport("typedoc/dist/lib/output/themes/default/partials/icon", "icons")
  @js.native
  val icons: Record[
    ReflectionKind | chevronDown | checkbox | menu | search | chevronSmall | anchor, 
    js.Function0[JsxElement]
  ] = js.native
}
