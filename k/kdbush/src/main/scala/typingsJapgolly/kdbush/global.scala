package typingsJapgolly.kdbush

import typingsJapgolly.kdbush.mod.Get
import typingsJapgolly.kdbush.mod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object KDBush {
    
    @JSGlobal("KDBush")
    @js.native
    open class ^[T] protected ()
      extends typingsJapgolly.kdbush.mod.^[T] {
      def this(points: Points) = this()
      def this(points: js.Array[T], getX: Get[T], getY: Get[T]) = this()
      def this(points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double) = this()
      def this(
        points: js.Array[T],
        getX: Get[T],
        getY: Get[T],
        nodeSize: Double,
        ArrayType: typingsJapgolly.kdbush.mod.ArrayType
      ) = this()
      def this(
        points: js.Array[T],
        getX: Get[T],
        getY: Get[T],
        nodeSize: Unit,
        ArrayType: typingsJapgolly.kdbush.mod.ArrayType
      ) = this()
    }
  }
}
