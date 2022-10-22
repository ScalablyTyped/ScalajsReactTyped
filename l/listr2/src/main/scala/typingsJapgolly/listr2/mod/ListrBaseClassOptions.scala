package typingsJapgolly.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parent class options.
  *
  * Parent class has more options where you can also select the and set renderer and non-tty renderer.
  *
  * Any subtasks will respect those options so they will be stripped of that properties.
  */
trait ListrBaseClassOptions[Ctx, Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */]
  extends StObject
     with ListrOptions[Ctx]
     with ListrDefaultRendererOptions[Renderer]
     with ListrDefaultNonTTYRendererOptions[FallbackRenderer]
object ListrBaseClassOptions {
  
  inline def apply[Ctx, Renderer /* <: ListrRendererValue */, FallbackRenderer /* <: ListrRendererValue */](): ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListrBaseClassOptions[Ctx, Renderer, FallbackRenderer]]
  }
}
