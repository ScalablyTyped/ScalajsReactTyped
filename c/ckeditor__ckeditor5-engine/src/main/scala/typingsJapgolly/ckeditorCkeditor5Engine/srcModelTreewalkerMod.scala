package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.Done
import typingsJapgolly.ckeditorCkeditor5Engine.anon.DoneValue
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelTreewalkerMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/treewalker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TreeWalker {
    /**
      * Creates a range iterator. All parameters are optional, but you have to specify either `boundaries` or `startPosition`.
      */
    def this(options: TreeWalkerOptions) = this()
  }
  
  @js.native
  trait TreeWalker
    extends StObject
       with Iterator[TreeWalkerValue, Any, Unit]
       with Iterable[TreeWalkerValue] {
    
    /**
      * Iterator boundaries.
      *
      * When the iterator is walking `'forward'` on the end of boundary or is walking `'backward'`
      * on the start of boundary, then `{ done: true }` is returned.
      *
      * If boundaries are not defined they are set before first and after last child of the root node.
      */
    val boundaries: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    /**
      * Walking direction. Defaults `'forward'`.
      */
    val direction: TreeWalkerDirection = js.native
    
    /**
      * Flag indicating whether iterator should ignore `elementEnd` tags. If the option is true walker will not
      * return a parent node of the start position. If this option is `true` each {@link module:engine/model/element~Element} will
      * be returned once, while if the option is `false` they might be returned twice:
      * for `'elementStart'` and `'elementEnd'`.
      */
    val ignoreElementEnd: Boolean = js.native
    
    /**
      * Gets the next tree walker's value.
      */
    def next(): Done | DoneValue = js.native
    
    /**
      * Iterator position. This is always static position, even if the initial position was a
      * {@link module:engine/model/liveposition~LivePosition live position}. If start position is not defined then position depends
      * on {@link #direction}. If direction is `'forward'` position starts form the beginning, when direction
      * is `'backward'` position starts from the end.
      */
    val position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Flag indicating whether iterator should enter elements or not. If the iterator is shallow child nodes of any
      * iterated node will not be returned along with `elementEnd` tag.
      */
    val shallow: Boolean = js.native
    
    /**
      * Flag indicating whether all consecutive characters with the same attributes should be
      * returned as one {@link module:engine/model/textproxy~TextProxy} (`true`) or one by one (`false`).
      */
    val singleCharacters: Boolean = js.native
    
    /**
      * Moves {@link #position} in the {@link #direction} skipping values as long as the callback function returns `true`.
      *
      * For example:
      *
      *     walker.skip( value => value.type == 'text' ); // <paragraph>[]foo</paragraph> -> <paragraph>foo[]</paragraph>
      *     walker.skip( () => true ); // Move the position to the end: <paragraph>[]foo</paragraph> -> <paragraph>foo</paragraph>[]
      *     walker.skip( () => false ); // Do not move the position.
      */
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
    - typingsJapgolly.ckeditorCkeditor5Engine.anon.IgnoreElementEnd
    - typingsJapgolly.ckeditorCkeditor5Engine.anon.Shallow
  */
  trait TreeWalkerOptions extends StObject
  object TreeWalkerOptions {
    
    inline def IgnoreElementEnd(boundaries: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): typingsJapgolly.ckeditorCkeditor5Engine.anon.IgnoreElementEnd = {
      val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.anon.IgnoreElementEnd]
    }
    
    inline def Shallow(startPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.anon.Shallow = {
      val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.anon.Shallow]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.anon.NextPosition
    - typingsJapgolly.ckeditorCkeditor5Engine.anon.PreviousPosition
  */
  trait TreeWalkerValue extends StObject
  object TreeWalkerValue {
    
    inline def NextPosition(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextproxyMod.default,
      length: Double,
      nextPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      previousPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      `type`: character | text
    ): typingsJapgolly.ckeditorCkeditor5Engine.anon.NextPosition = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.anon.NextPosition]
    }
    
    inline def PreviousPosition(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default,
      length: Double,
      nextPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      previousPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      `type`: elementStart | elementEnd
    ): typingsJapgolly.ckeditorCkeditor5Engine.anon.PreviousPosition = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.anon.PreviousPosition]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
    - typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
  */
  trait TreeWalkerValueType extends StObject
  object TreeWalkerValueType {
    
    inline def character: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character = "character".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character]
    
    inline def elementEnd: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd = "elementEnd".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementEnd]
    
    inline def elementStart: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart = "elementStart".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.elementStart]
    
    inline def text: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text = "text".asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text]
  }
}
