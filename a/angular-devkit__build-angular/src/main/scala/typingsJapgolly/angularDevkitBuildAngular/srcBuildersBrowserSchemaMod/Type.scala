package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends StObject
@JSImport("@angular-devkit/build-angular/src/builders/browser/schema", "Type")
@js.native
object Type extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Type & String] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with Type
  /* "all" */ val All: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.All & String = js.native
  
  @js.native
  sealed trait AllScript
    extends StObject
       with Type
  /* "allScript" */ val AllScript: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.AllScript & String = js.native
  
  @js.native
  sealed trait Any
    extends StObject
       with Type
  /* "any" */ val Any: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.Any & String = js.native
  
  @js.native
  sealed trait AnyComponentStyle
    extends StObject
       with Type
  /* "anyComponentStyle" */ val AnyComponentStyle: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.AnyComponentStyle & String = js.native
  
  @js.native
  sealed trait AnyScript
    extends StObject
       with Type
  /* "anyScript" */ val AnyScript: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.AnyScript & String = js.native
  
  @js.native
  sealed trait Bundle
    extends StObject
       with Type
  /* "bundle" */ val Bundle: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.Bundle & String = js.native
  
  @js.native
  sealed trait Initial
    extends StObject
       with Type
  /* "initial" */ val Initial: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.Initial & String = js.native
}
