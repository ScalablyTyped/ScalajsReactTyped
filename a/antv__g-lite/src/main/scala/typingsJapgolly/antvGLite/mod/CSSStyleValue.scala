package typingsJapgolly.antvGLite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@antv/g-lite", "CSSStyleValue")
@js.native
open class CSSStyleValue ()
  extends typingsJapgolly.antvGLite.distCssMod.CSSStyleValue
/* static members */
object CSSStyleValue {
  
  @JSImport("@antv/g-lite", "CSSStyleValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAngle(unit: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAngle")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLength(`type`: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLength")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRelativeUnit(`type`: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelativeUnit")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTime(unit: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTime")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
