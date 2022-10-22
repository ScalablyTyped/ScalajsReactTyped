package typingsJapgolly.jsSdsl

import typingsJapgolly.jsSdsl.distEsmContainerContainerBaseMod.Base
import typingsJapgolly.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerOtherContainerStackMod {
  
  @JSImport("js-sdsl/dist/esm/container/OtherContainer/Stack", JSImport.Default)
  @js.native
  open class default[T] () extends Stack[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @js.native
  trait Stack[T] extends Base {
    
    /**
      * @description Removes the end element.
      */
    def pop(): Unit = js.native
    
    /**
      * @description Insert element to stack's end.
      */
    def push(element: T): Unit = js.native
    
    /**
      * @description Accesses the end element.
      */
    def top(): js.UndefOr[T] = js.native
  }
}
