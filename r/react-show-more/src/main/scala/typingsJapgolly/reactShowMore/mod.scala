package typingsJapgolly.reactShowMore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  open class default protected ()
    extends ClassicComponent[ReactShowMoreProps, js.Object] {
    def this(props: ReactShowMoreProps) = this()
    def this(props: ReactShowMoreProps, context: Any) = this()
  }
  @JSImport("react-show-more", JSImport.Default)
  @js.native
  val default: ClassicComponentClass[ReactShowMoreProps] = js.native
  
  trait ReactShowMoreProps extends StObject {
    
    var anchorClass: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[String] = js.undefined
    
    var less: js.UndefOr[String] = js.undefined
    
    var lines: js.UndefOr[Double] = js.undefined
    
    var more: js.UndefOr[String] = js.undefined
  }
  object ReactShowMoreProps {
    
    inline def apply(): ReactShowMoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactShowMoreProps]
    }
    
    extension [Self <: ReactShowMoreProps](x: Self) {
      
      inline def setAnchorClass(value: String): Self = StObject.set(x, "anchorClass", value.asInstanceOf[js.Any])
      
      inline def setAnchorClassUndefined: Self = StObject.set(x, "anchorClass", js.undefined)
      
      inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      inline def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setMore(value: String): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
      
      inline def setMoreUndefined: Self = StObject.set(x, "more", js.undefined)
    }
  }
  
  type _To = ClassicComponentClass[ReactShowMoreProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ClassicComponentClass[ReactShowMoreProps] = default
}
