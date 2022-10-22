package typingsJapgolly.dragster

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dragster", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Dragster {
    def this(elem: HTMLElement) = this()
    
    /* CompleteClass */
    override def removeListeners(): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  @JSImport("dragster", JSImport.Namespace)
  @js.native
  val ^ : DragsterStatic = js.native
  
  trait Dragster extends StObject {
    
    def removeListeners(): Unit
    
    def reset(): Unit
  }
  object Dragster {
    
    inline def apply(removeListeners: Callback, reset: Callback): Dragster = {
      val __obj = js.Dynamic.literal(removeListeners = removeListeners.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[Dragster]
    }
    
    extension [Self <: Dragster](x: Self) {
      
      inline def setRemoveListeners(value: Callback): Self = StObject.set(x, "removeListeners", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  @js.native
  trait DragsterStatic
    extends StObject
       with Instantiable1[/* elem */ HTMLElement, Dragster] {
    
    def apply(elem: HTMLElement): Dragster = js.native
  }
  
  type _To = DragsterStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DragsterStatic = ^
  
  object global {
    
    trait Window extends StObject {
      
      def Dragster(elem: HTMLElement): typingsJapgolly.dragster.mod.Dragster
      @JSName("Dragster")
      var Dragster_Original: DragsterStatic
    }
    object Window {
      
      inline def apply(Dragster: DragsterStatic): Window = {
        val __obj = js.Dynamic.literal(Dragster = Dragster.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setDragster(value: DragsterStatic): Self = StObject.set(x, "Dragster", value.asInstanceOf[js.Any])
      }
    }
  }
}
