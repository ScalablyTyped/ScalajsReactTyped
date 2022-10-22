package typingsJapgolly.webgme.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeUtil {
  
  @JSGlobal("GmeUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def ASSERT(condition: Boolean): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("ASSERT")(condition.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @JSGlobal("GmeUtil.CANON")
  @js.native
  def CANON_ : typingsJapgolly.webgme.GmeUtil.Canon = js.native
  
  inline def CANON__=(x: typingsJapgolly.webgme.GmeUtil.Canon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANON")(x.asInstanceOf[js.Any])
  
  @JSGlobal("GmeUtil.Canon")
  @js.native
  open class Canon ()
    extends StObject
       with typingsJapgolly.webgme.GmeUtil.Canon {
    
    /* CompleteClass */
    override def parse(thing: Any): String = js.native
    
    /* CompleteClass */
    override def stringify(thing: Any): String = js.native
  }
}
