package typingsJapgolly.vegaLite

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.vegaLite.anon.Visual
import typingsJapgolly.vegaLite.buildSrcChannelMod.SingleDefUnitChannel
import typingsJapgolly.vegaLite.buildSrcCompileDataTimeunitMod.TimeUnitNode
import typingsJapgolly.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typingsJapgolly.vegaLite.buildSrcSelectionMod.SelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionProjectMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/project", JSImport.Default)
  @js.native
  val default: SelectionCompiler[SelectionType] = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/project", "SelectionProjectionComponent")
  @js.native
  open class SelectionProjectionComponent protected () extends StObject {
    def this(items: SelectionProjection*) = this()
    
    var hasChannel: Partial[Record[SingleDefUnitChannel, SelectionProjection]] = js.native
    
    var hasField: Record[String, SelectionProjection] = js.native
    
    var hasSelectionId: Boolean = js.native
    
    var items: js.Array[SelectionProjection] = js.native
    
    var timeUnit: js.UndefOr[TimeUnitNode] = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/selection/project", "TUPLE_FIELDS")
  @js.native
  val TUPLE_FIELDS: /* "_tuple_fields" */ String = js.native
  
  trait SelectionProjection extends StObject {
    
    var channel: js.UndefOr[SingleDefUnitChannel] = js.undefined
    
    var field: String
    
    var hasLegend: js.UndefOr[Boolean] = js.undefined
    
    var signals: js.UndefOr[Visual] = js.undefined
    
    var `type`: TupleStoreType
  }
  object SelectionProjection {
    
    inline def apply(field: String, `type`: TupleStoreType): SelectionProjection = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionProjection]
    }
    
    extension [Self <: SelectionProjection](x: Self) {
      
      inline def setChannel(value: SingleDefUnitChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setHasLegend(value: Boolean): Self = StObject.set(x, "hasLegend", value.asInstanceOf[js.Any])
      
      inline def setHasLegendUndefined: Self = StObject.set(x, "hasLegend", js.undefined)
      
      inline def setSignals(value: Visual): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      inline def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      inline def setType(value: TupleStoreType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.E
    - typingsJapgolly.vegaLite.vegaLiteStrings.R
    - typingsJapgolly.vegaLite.vegaLiteStrings.`R-RE`
  */
  trait TupleStoreType extends StObject
  object TupleStoreType {
    
    inline def E: typingsJapgolly.vegaLite.vegaLiteStrings.E = "E".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.E]
    
    inline def R: typingsJapgolly.vegaLite.vegaLiteStrings.R = "R".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.R]
    
    inline def `R-RE`: typingsJapgolly.vegaLite.vegaLiteStrings.`R-RE` = "R-RE".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.`R-RE`]
  }
  
  type _To = SelectionCompiler[SelectionType]
  
  /* This means you don't have to write `default`, but can instead just say `buildSrcCompileSelectionProjectMod.foo` */
  override def _to: SelectionCompiler[SelectionType] = default
}
