package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.BoundariesDirection
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
import typingsJapgolly.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewTreewalkerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/treewalker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TreeWalker {
    def this(options: BoundariesDirection) = this()
  }
  
  @js.native
  trait TreeWalker
    extends StObject
       with Iterable[TreeWalkerValue] {
    
    val boundaries: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    val direction: TreeWalkerDirection = js.native
    
    val ignoreElementEnd: Boolean = js.native
    
    def next(): TreeWalkerValue = js.native
    
    val position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    val shallow: Boolean = js.native
    
    val singleCharacters: Boolean = js.native
    
    def skip(skip: js.Function1[/* value */ TreeWalkerValue, Boolean]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
  */
  trait TreeWalkerDirection extends StObject
  object TreeWalkerDirection {
    
    inline def backward: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward = "backward".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward]
    
    inline def forward: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward = "forward".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.anon.ItemLength
    - typingsJapgolly.ckeditorCkeditor5Engine.anon.LengthNextPosition
  */
  trait TreeWalkerValue extends StObject
  object TreeWalkerValue {
    
    inline def ItemLength(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextproxyMod.default,
      length: Double,
      nextPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      previousPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.anon.ItemLength = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.anon.ItemLength]
    }
    
    inline def LengthNextPosition(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default,
      length: Double,
      nextPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      previousPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      `type`: elementStart | elementEnd
    ): typingsJapgolly.ckeditorCkeditor5Engine.anon.LengthNextPosition = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.anon.LengthNextPosition]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
  */
  trait TreeWalkerValueType extends StObject
  object TreeWalkerValueType {
    
    inline def elementEnd: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd = "elementEnd".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd]
    
    inline def elementStart: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart = "elementStart".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart]
    
    inline def text: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text = "text".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text]
  }
}
