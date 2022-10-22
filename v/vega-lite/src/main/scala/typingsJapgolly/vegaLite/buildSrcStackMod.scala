package typingsJapgolly.vegaLite

import typingsJapgolly.std.Set
import typingsJapgolly.vegaLite.anon.ChannelFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldName
import typingsJapgolly.vegaLite.buildSrcEncodingMod.Encoding
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcMarkMod.Mark
import typingsJapgolly.vegaLite.buildSrcMarkMod.MarkDef
import typingsJapgolly.vegaLite.vegaLiteStrings.arc
import typingsJapgolly.vegaLite.vegaLiteStrings.area
import typingsJapgolly.vegaLite.vegaLiteStrings.bar
import typingsJapgolly.vegaLite.vegaLiteStrings.circle
import typingsJapgolly.vegaLite.vegaLiteStrings.geoshape
import typingsJapgolly.vegaLite.vegaLiteStrings.image
import typingsJapgolly.vegaLite.vegaLiteStrings.line
import typingsJapgolly.vegaLite.vegaLiteStrings.point
import typingsJapgolly.vegaLite.vegaLiteStrings.radius
import typingsJapgolly.vegaLite.vegaLiteStrings.rect
import typingsJapgolly.vegaLite.vegaLiteStrings.rule
import typingsJapgolly.vegaLite.vegaLiteStrings.square
import typingsJapgolly.vegaLite.vegaLiteStrings.text
import typingsJapgolly.vegaLite.vegaLiteStrings.theta
import typingsJapgolly.vegaLite.vegaLiteStrings.tick
import typingsJapgolly.vegaLite.vegaLiteStrings.trail
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.xOffset
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import typingsJapgolly.vegaLite.vegaLiteStrings.yOffset
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStackMod {
  
  @JSImport("vega-lite/build/src/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/stack", "STACKABLE_MARKS")
  @js.native
  val STACKABLE_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  @JSImport("vega-lite/build/src/stack", "STACK_BY_DEFAULT_MARKS")
  @js.native
  val STACK_BY_DEFAULT_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  inline def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStackOffset")(s.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean]
  
  inline def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: Mark, encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  
  /* keyof vega-lite.anon.Center */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.zero
    - typingsJapgolly.vegaLite.vegaLiteStrings.center
    - typingsJapgolly.vegaLite.vegaLiteStrings.normalize
  */
  trait StackOffset extends StObject
  
  trait StackProperties extends StObject {
    
    /** Measure axis of the stack. */
    var fieldChannel: x | y | theta | radius
    
    /** Dimension axis of the stack. */
    var groupbyChannels: js.Array[x | y | theta | radius | xOffset | yOffset]
    
    /** Field for groupbyChannel. */
    var groupbyFields: Set[FieldName]
    
    /**
      * Whether this stack will produce impute transform
      */
    var impute: Boolean
    
    /**
      * See `stack` property of Position Field Def.
      */
    var offset: StackOffset
    
    /** Stack-by fields e.g., color, detail */
    var stackBy: js.Array[ChannelFieldDef]
  }
  object StackProperties {
    
    inline def apply(
      fieldChannel: x | y | theta | radius,
      groupbyChannels: js.Array[x | y | theta | radius | xOffset | yOffset],
      groupbyFields: Set[FieldName],
      impute: Boolean,
      offset: StackOffset,
      stackBy: js.Array[ChannelFieldDef]
    ): StackProperties = {
      val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], groupbyChannels = groupbyChannels.asInstanceOf[js.Any], groupbyFields = groupbyFields.asInstanceOf[js.Any], impute = impute.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stackBy = stackBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProperties]
    }
    
    extension [Self <: StackProperties](x: Self) {
      
      inline def setFieldChannel(value: typingsJapgolly.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "fieldChannel", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannels(
        value: js.Array[
              typingsJapgolly.vegaLite.vegaLiteStrings.x | y | theta | radius | xOffset | yOffset
            ]
      ): Self = StObject.set(x, "groupbyChannels", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannelsVarargs(value: (typingsJapgolly.vegaLite.vegaLiteStrings.x | y | theta | radius | xOffset | yOffset)*): Self = StObject.set(x, "groupbyChannels", js.Array(value*))
      
      inline def setGroupbyFields(value: Set[FieldName]): Self = StObject.set(x, "groupbyFields", value.asInstanceOf[js.Any])
      
      inline def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStackBy(value: js.Array[ChannelFieldDef]): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
      
      inline def setStackByVarargs(value: ChannelFieldDef*): Self = StObject.set(x, "stackBy", js.Array(value*))
    }
  }
}
