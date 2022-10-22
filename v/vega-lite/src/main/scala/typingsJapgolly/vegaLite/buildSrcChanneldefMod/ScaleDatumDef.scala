package typingsJapgolly.vegaLite.buildSrcChanneldefMod

import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcScaleMod.Scale
import typingsJapgolly.vegaLite.buildSrcTypeMod.Type
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Text
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent vega-lite.vega-lite/build/src/channeldef.ScaleMixins */
/* Inlined parent vega-lite.vega-lite/build/src/channeldef.DatumDef<F, vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef> */
trait ScaleDatumDef[F /* <: Field */] extends StObject {
  
  /**
    * Relative position on a band of a stacked, binned, time unit, or band scale. For example, the marks will be positioned at the beginning of the band if set to `0`, and at the middle of the band if set to `0.5`.
    *
    * @minimum 0
    * @maximum 1
    */
  var bandPosition: js.UndefOr[Double] = js.undefined
  
  /**
    * A constant value in data domain.
    */
  var datum: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: F extends vega-lite.vega-lite/build/src/channeldef.RepeatRef ? vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef | vega-lite.vega-lite/build/src/channeldef.RepeatRef : vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef */ js.Any
  ] = js.undefined
  
  /**
    * An object defining properties of the channel's scale, which is the function that transforms values in the data domain (numbers, dates, strings, etc) to visual values (pixels, colors, sizes) of the encoding channels.
    *
    * If `null`, the scale will be [disabled and the data value will be directly encoded](https://vega.github.io/vega-lite/docs/scale.html#disable).
    *
    * __Default value:__ If undefined, default [scale properties](https://vega.github.io/vega-lite/docs/scale.html) are applied.
    *
    * __See also:__ [`scale`](https://vega.github.io/vega-lite/docs/scale.html) documentation.
    */
  var scale: js.UndefOr[(Scale[ExprRef | SignalRef]) | Null] = js.undefined
  
  /**
    * A title for the field. If `null`, the title will be removed.
    *
    * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
    *
    * __Notes__:
    *
    * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/usage/compile.html#field-title).
    *
    * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
    */
  var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object ScaleDatumDef {
  
  inline def apply[F /* <: Field */](): ScaleDatumDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleDatumDef[F]]
  }
  
  extension [Self <: ScaleDatumDef[?], F /* <: Field */](x: Self & ScaleDatumDef[F]) {
    
    inline def setBandPosition(value: Double): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
    
    inline def setDatum(
      value: /* import warning: importer.ImportType#apply Failed type conversion: F extends vega-lite.vega-lite/build/src/channeldef.RepeatRef ? vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef | vega-lite.vega-lite/build/src/channeldef.RepeatRef : vega-lite.vega-lite/build/src/channeldef.PrimitiveValue | vega-lite.vega-lite/build/src/datetime.DateTime | vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef */ js.Any
    ): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
    
    inline def setScale(value: Scale[ExprRef | SignalRef]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
