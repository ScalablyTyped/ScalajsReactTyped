package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LanguageVariant extends StObject
@JSImport("typescript", "LanguageVariant")
@js.native
object LanguageVariant extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LanguageVariant & Double] = js.native
  
  @js.native
  sealed trait JSX
    extends StObject
       with LanguageVariant
  /* 1 */ val JSX: typingsJapgolly.typescript.mod.LanguageVariant.JSX & Double = js.native
  
  @js.native
  sealed trait Standard
    extends StObject
       with LanguageVariant
  /* 0 */ val Standard: typingsJapgolly.typescript.mod.LanguageVariant.Standard & Double = js.native
}
