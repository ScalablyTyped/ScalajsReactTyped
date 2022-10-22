package typingsJapgolly.floatingUiCore.srcTypesMod

import typingsJapgolly.floatingUiCore.anon.Fn
import typingsJapgolly.floatingUiCore.anon.PartialLimitShiftOptions
import typingsJapgolly.floatingUiCore.anon.PartialOptions
import typingsJapgolly.floatingUiCore.anon.PartialOptionsOptions
import typingsJapgolly.floatingUiCore.anon.PartialOptionsOptionsAltBoundary
import typingsJapgolly.floatingUiCore.anon.PartialOptionsOptionsApply
import typingsJapgolly.floatingUiCore.anon.PartialOptionsOptionsBoundary
import typingsJapgolly.floatingUiCore.anon.PartialOptionsOptionsCrossAxis
import typingsJapgolly.floatingUiCore.anon.PartialOptionsPadding
import typingsJapgolly.floatingUiCore.anon.PartialSideObject
import typingsJapgolly.floatingUiCore.srcMiddlewareArrowMod.Options
import typingsJapgolly.floatingUiCore.srcTypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def arrow(options: Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("arrow")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def autoPlacement(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")().asInstanceOf[Middleware]
inline def autoPlacement(options: PartialOptionsOptions): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("autoPlacement")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def computePosition: ComputePosition_ = ^.asInstanceOf[js.Dynamic].selectDynamic("computePosition").asInstanceOf[ComputePosition_]

inline def detectOverflow(middlewareArguments: MiddlewareArguments): js.Promise[SideObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SideObject]]
inline def detectOverflow(middlewareArguments: MiddlewareArguments, options: PartialOptions): js.Promise[SideObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(middlewareArguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SideObject]]

inline def flip(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")().asInstanceOf[Middleware]
inline def flip(options: PartialOptionsOptionsAltBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("flip")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def hide(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Middleware]
inline def hide(hasStrategyDetectOverflowOptions: PartialOptionsOptionsBoundary): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")(hasStrategyDetectOverflowOptions.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def `inline`(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")().asInstanceOf[Middleware]
inline def `inline`(options: PartialOptionsPadding): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("inline")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def limitShift(): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")().asInstanceOf[Fn]
inline def limitShift(options: PartialLimitShiftOptions): Fn = ^.asInstanceOf[js.Dynamic].applyDynamic("limitShift")(options.asInstanceOf[js.Any]).asInstanceOf[Fn]

inline def offset(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[Middleware]
inline def offset(value: typingsJapgolly.floatingUiCore.srcMiddlewareOffsetMod.Options): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(value.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def rectToClientRect(rect: Rect): ClientRectObject = ^.asInstanceOf[js.Dynamic].applyDynamic("rectToClientRect")(rect.asInstanceOf[js.Any]).asInstanceOf[ClientRectObject]

inline def shift(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")().asInstanceOf[Middleware]
inline def shift(options: PartialOptionsOptionsCrossAxis): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("shift")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]

inline def size(): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Middleware]
inline def size(options: PartialOptionsOptionsApply): Middleware = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(options.asInstanceOf[js.Any]).asInstanceOf[Middleware]

type AlignedPlacement = /* template literal string: ${Side}-${Alignment} */ String

type Boundary = Any

type ComputePosition_ = js.Function3[
/* reference */ Any, 
/* floating */ Any, 
/* config */ ComputePositionConfig, 
js.Promise[ComputePositionReturn]]

type FloatingElement = Any

type Padding = Double | PartialSideObject

type Placement = Side | AlignedPlacement

type Promisable[T] = T | js.Promise[T]

type ReferenceElement = Any
