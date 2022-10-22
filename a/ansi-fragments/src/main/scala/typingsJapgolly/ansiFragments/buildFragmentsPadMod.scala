package typingsJapgolly.ansiFragments

import typingsJapgolly.ansiFragments.buildFragmentsIfragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFragmentsPadMod {
  
  @JSImport("ansi-fragments/build/fragments/Pad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Pad", "Pad")
  @js.native
  open class Pad_ protected ()
    extends StObject
       with IFragment {
    def this(count: Double) = this()
    def this(count: Double, separator: String) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val count: Any = js.native
    
    /* private */ val separator: Any = js.native
  }
  
  inline def pad(count: Double): Pad_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(count.asInstanceOf[js.Any]).asInstanceOf[Pad_]
  inline def pad(count: Double, separator: String): Pad_ = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(count.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[Pad_]
}
