package typingsJapgolly.vegaLite.buildSrcSpecBaseMod

import typingsJapgolly.vegaLite.anon.OffsetIsDiscrete
import typingsJapgolly.vegaLite.buildSrcSpecBaseMod.^
import typingsJapgolly.vegaLite.buildSrcSpecMod.NormalizedSpec
import typingsJapgolly.vegaLite.vegaLiteStrings.concat
import typingsJapgolly.vegaLite.vegaLiteStrings.container
import typingsJapgolly.vegaLite.vegaLiteStrings.facet
import typingsJapgolly.vegaLite.vegaLiteStrings.merged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_SPACING: /* 20 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SPACING").asInstanceOf[/* 20 */ Double]

inline def extractCompositionLayout(spec: NormalizedSpec, specType: facet | concat, config: CompositionConfigMixins): GenericCompositionLayoutWithColumns = (^.asInstanceOf[js.Dynamic].applyDynamic("extractCompositionLayout")(spec.asInstanceOf[js.Any], specType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[GenericCompositionLayoutWithColumns]

inline def getStepFor(hasStepOffsetIsDiscrete: OffsetIsDiscrete): StepFor = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepFor")(hasStepOffsetIsDiscrete.asInstanceOf[js.Any]).asInstanceOf[StepFor]

inline def isFrameMixins(o: Any): /* is vega-lite.vega-lite/build/src/spec/base.FrameMixins<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFrameMixins")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.FrameMixins<any> */ Boolean]

inline def isStep(size: container | merged): /* is vega-lite.vega-lite/build/src/spec/base.Step */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ Boolean]
inline def isStep(size: Double): /* is vega-lite.vega-lite/build/src/spec/base.Step */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ Boolean]
inline def isStep(size: Step): /* is vega-lite.vega-lite/build/src/spec/base.Step */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ Boolean]
