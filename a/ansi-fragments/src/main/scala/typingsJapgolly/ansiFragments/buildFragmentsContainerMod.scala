package typingsJapgolly.ansiFragments

import typingsJapgolly.ansiFragments.buildFragmentsIfragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFragmentsContainerMod {
  
  @JSImport("ansi-fragments/build/fragments/Container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ansi-fragments/build/fragments/Container", "Container")
  @js.native
  open class Container_ protected ()
    extends StObject
       with IFragment {
    def this(children: js.Array[String | IFragment]) = this()
    
    /* CompleteClass */
    override def build(): String = js.native
    
    /* private */ val children: Any = js.native
  }
  
  inline def container(children: (String | IFragment)*): Container_ = ^.asInstanceOf[js.Dynamic].applyDynamic("container")(children.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Container_]
}
