package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.anon.AcceptNode
import typingsJapgolly.std.anon.LookupNamespaceURI
import typingsJapgolly.std.stdStrings.`public-key`
import typingsJapgolly.std.stdStrings.auto
import typingsJapgolly.std.stdStrings.password
import typingsJapgolly.std.stdStrings.require
import typingsJapgolly.std.stdStrings.vibration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlgorithmIdentifier = org.scalajs.dom.Algorithm | java.lang.String

type ArrayBufferLike = js.typedarray.ArrayBuffer | SharedArrayBuffer

/** Available only in secure contexts. */
type AudioWorklet = Worklet

type AutoKeyword = auto

type BigInteger = js.typedarray.Uint8Array

type BinaryData = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

type BlobCallback = js.Function1[/* blob */ org.scalajs.dom.Blob | Null, Unit]

type BlobPart = BufferSource | org.scalajs.dom.Blob | java.lang.String

type BodyInit = org.scalajs.dom.ReadableStream[Any] | XMLHttpRequestBodyInit

type BufferSource = js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer

/** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
type CDATASection = org.scalajs.dom.Text

type COSEAlgorithmIdentifier = Double

type CSSNumberish = Double

/** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
type CSSSupportsRule = CSSConditionRule

type CanvasImageSource = HTMLOrSVGImageElement | org.scalajs.dom.HTMLVideoElement | org.scalajs.dom.HTMLCanvasElement | ImageBitmap

/**
  * Convert first character of string literal type to uppercase
  */
type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

/** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
type ChannelMergerNode = org.scalajs.dom.AudioNode

/** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
type ChannelSplitterNode = org.scalajs.dom.AudioNode

type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]

/** @deprecated */
type ClientRect = org.scalajs.dom.DOMRect

type ClipboardItemData = js.Promise[java.lang.String | org.scalajs.dom.Blob]

type ClipboardItems = js.Array[ClipboardItem]

/** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
type Comment = org.scalajs.dom.CharacterData

type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters

type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters

type ConstrainDouble = Double | ConstrainDoubleRange

type ConstrainULong = Double | ConstrainULongRange

type DOMHighResTimeStamp = Double

/** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
type DOMStringMap = /* standard dom */
StringDictionary[js.UndefOr[java.lang.String]]

type DecodeErrorCallback = js.Function1[/* error */ org.scalajs.dom.DOMException, Unit]

type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalajs.dom.AudioBuffer, Unit]

type DocumentTimeline = AnimationTimeline

/** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
type ElementTagNameMap = HTMLElementTagNameMap & (Pick[
SVGElementTagNameMap, 
Exclude[
  /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63, starting with typingsJapgolly.std.stdStrings.a, typingsJapgolly.std.stdStrings.animate, typingsJapgolly.std.stdStrings.animateMotion */ Any, 
  /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.std.stdStrings.a, typingsJapgolly.std.stdStrings.abbr, typingsJapgolly.std.stdStrings.address */ Any
]])

type EpochTimeStamp = Double

type ErrorCallback = js.Function1[/* err */ org.scalajs.dom.DOMException, Unit]

type EvalError = js.Error

type EventListener = js.Function1[/* evt */ org.scalajs.dom.Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

type FileCallback = js.Function1[/* file */ org.scalajs.dom.File, Unit]

type FileSystemEntriesCallback = js.Function1[/* entries */ js.Array[FileSystemEntry], Unit]

type FileSystemEntryCallback = js.Function1[/* entry */ FileSystemEntry, Unit]

type FlatArray[Arr, Depth /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: std.anon.Done<Arr, Depth>[Depth extends -1 ? 'done' : 'recur'] */ js.Any

type Float32List = js.typedarray.Float32Array | js.Array[GLfloat]

type FormDataEntryValue = org.scalajs.dom.File | java.lang.String

type FrameRequestCallback = js.Function1[/* time */ DOMHighResTimeStamp, Unit]

type FunctionStringCallback = js.Function1[/* data */ java.lang.String, Unit]

type GLbitfield = Double

type GLboolean = scala.Boolean

type GLclampf = Double

type GLenum = Double

type GLfloat = Double

type GLint = Double

type GLint64 = Double

type GLintptr = Double

type GLsizei = Double

type GLsizeiptr = Double

type GLuint = Double

type GLuint64 = Double

type GamepadHapticActuatorType = vibration

type HTMLOrSVGImageElement = org.scalajs.dom.HTMLImageElement | org.scalajs.dom.SVGImageElement

type HTMLOrSVGScriptElement = org.scalajs.dom.HTMLScriptElement | org.scalajs.dom.SVGScriptElement

type HashAlgorithmIdentifier = AlgorithmIdentifier

type HeadersInit = (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | (Record[java.lang.String, java.lang.String]) | org.scalajs.dom.Headers

type IDBValidKey = Double | java.lang.String | js.Date | BufferSource | js.Array[Any]

type IdleRequestCallback = js.Function1[/* deadline */ IdleDeadline, Unit]

type ImageBitmapSource = CanvasImageSource | org.scalajs.dom.Blob | org.scalajs.dom.ImageData

/**
  * The type for the `assert` property of the optional second argument to `import()`.
  */
type ImportAssertions = /* standard es5 */
StringDictionary[java.lang.String]

type InputDeviceInfo = org.scalajs.dom.MediaDeviceInfo

type Int32List = js.typedarray.Int32Array | js.Array[GLint]

type IntersectionObserverCallback = js.Function2[
/* entries */ js.Array[IntersectionObserverEntry], 
/* observer */ IntersectionObserver, 
Unit]

type LineAndPositionSetting = Double | AutoKeyword

type LockGrantedCallback = js.Function1[/* lock */ Lock | Null, Any]

/**
  * Convert string literal type to lowercase
  */
type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type MediaProvider = org.scalajs.dom.MediaStream | MediaSource | org.scalajs.dom.Blob

type MediaSessionActionHandler = js.Function1[/* details */ MediaSessionActionDetails, Unit]

type MessageEventSource = org.scalajs.dom.Window | org.scalajs.dom.MessagePort | org.scalajs.dom.ServiceWorker

type MethodDecorator = js.Function3[
/* target */ js.Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

type MutationCallback = js.Function2[
/* mutations */ js.Array[org.scalajs.dom.MutationRecord], 
/* observer */ org.scalajs.dom.MutationObserver, 
Unit]

type NamedCurve = java.lang.String

type NodeFilter = (js.Function1[/* node */ org.scalajs.dom.Node, Double]) | AcceptNode

/**
  * Exclude null and undefined from T
  */
type NonNullable[T] = T & js.Object

type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, Unit]

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ java.lang.String */] = Pick[T, Exclude[/* keyof T */ java.lang.String, K]]

type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | Null

type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ org.scalajs.dom.Event, java.lang.String | Null]

type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null

type OnErrorEventHandlerNonNull = js.Function5[
/* event */ org.scalajs.dom.Event | java.lang.String, 
/* source */ js.UndefOr[java.lang.String], 
/* lineno */ js.UndefOr[Double], 
/* colno */ js.UndefOr[Double], 
/* error */ js.UndefOr[js.Error], 
Any]

type ParameterDecorator = js.Function3[
/* target */ js.Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* parameterIndex */ Double, 
Unit]

/**
  * Make all properties in T optional
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]:? T[P]}
  }}}
  */
type Partial[T] = T

type PaymentRequestUpdateEventInit = EventInit

type PerformanceEntryList = js.Array[org.scalajs.dom.PerformanceEntry]

type PerformanceObserverCallback = js.Function2[/* entries */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]

type PerformancePaintTiming = org.scalajs.dom.PerformanceEntry

/**
  * From T, pick a set of properties whose keys are in the union K
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = T

type PositionCallback = js.Function1[/* position */ GeolocationPosition, Unit]

type PositionErrorCallback = js.Function1[/* positionError */ GeolocationPositionError, Unit]

type PromiseConstructorLike = Instantiable1[
/* executor */ js.Function2[
  /* resolve */ js.Function1[/* value */ js.Object | PromiseLike[js.Object], Unit], 
  /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
  Unit
], 
PromiseLike[js.Object]]

type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]

type PropertyDescriptorMap = /* standard es5 */
StringDictionary[js.PropertyDescriptor]

type PropertyKey = java.lang.String | Double | js.Symbol

type PublicKeyCredentialType = `public-key`

type QueuingStrategySize[T] = js.Function1[/* chunk */ T, Double]

type RTCAnswerOptions = RTCOfferAnswerOptions

type RTCIceCredentialType = password

type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalajs.dom.DOMException, Unit]

type RTCRtcpMuxPolicy = require

type RTCRtpReceiveParameters = RTCRtpParameters

type RTCRtpSynchronizationSource = RTCRtpContributingSource

type RTCSessionDescriptionCallback = js.Function1[/* description */ org.scalajs.dom.RTCSessionDescriptionInit, Unit]

type RangeError = js.Error

type ReadableStreamController[T] = ReadableStreamDefaultController[T]

type ReadableStreamReader[T] = ReadableStreamDefaultReader[T]

/**
  * Make all properties in T readonly
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {readonly [ P in keyof T ]: T[P]}
  }}}
  */
type Readonly[T] = T

/**
  * Construct a type with a set of properties K of type T
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation throws away the known field names. 
  * TS definition: {{{
  {[ P in K ]: T}
  }}}
  */
type Record[K /* <: /* keyof any */ java.lang.String */, T] = StringDictionary[T]

type ReferenceError = js.Error

type RemotePlaybackAvailabilityCallback = js.Function1[/* available */ scala.Boolean, Unit]

/* Rewritten from type alias, can be one of: 
  - org.scalajs.dom.CanvasRenderingContext2D
  - typingsJapgolly.std.ImageBitmapRenderingContext
  - org.scalajs.dom.WebGLRenderingContext
  - typingsJapgolly.std.WebGL2RenderingContext
*/
type RenderingContext = _RenderingContext | org.scalajs.dom.CanvasRenderingContext2D | org.scalajs.dom.WebGLRenderingContext

type RequestInfo = org.scalajs.dom.Request | java.lang.String

/**
  * Make all properties in T required
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]: -? T[P]}
  }}}
  */
type Required[T] = T

type ResizeObserverCallback = js.Function2[/* entries */ js.Array[ResizeObserverEntry], /* observer */ ResizeObserver, Unit]

type SVGMatrix = DOMMatrix

type SVGPoint = DOMPoint

type SVGRect = org.scalajs.dom.DOMRect

type StaticRange = AbstractRange

type SyntaxError = js.Error

type TexImageSource = ImageBitmap | org.scalajs.dom.ImageData | org.scalajs.dom.HTMLImageElement | org.scalajs.dom.HTMLCanvasElement | org.scalajs.dom.HTMLVideoElement

type TimerHandler = java.lang.String | js.Function

type Transferable = js.typedarray.ArrayBuffer | org.scalajs.dom.MessagePort | ImageBitmap

type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | PromiseLike[Unit]]

type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Any]

type TransformerTransformCallback[I, O] = js.Function2[
/* chunk */ I, 
/* controller */ TransformStreamDefaultController[O], 
Unit | PromiseLike[Unit]]

type TypeError = js.Error

type URIError = js.Error

type Uint32List = js.typedarray.Uint32Array | js.Array[GLuint]

/**
  * Convert first character of string literal type to lowercase
  */
type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | PromiseLike[Unit]]

type UnderlyingSinkCloseCallback = js.Function0[Unit | PromiseLike[Unit]]

type UnderlyingSinkStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Any]

type UnderlyingSinkWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController, 
Unit | PromiseLike[Unit]]

type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | PromiseLike[Unit]]

type UnderlyingSourcePullCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Unit | PromiseLike[Unit]]

type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Any]

/**
  * Convert string literal type to uppercase
  */
type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type UvmEntries = js.Array[UvmEntry]

type UvmEntry = js.Array[Double]

type VibratePattern = Double | js.Array[Double]

type VideoFrameRequestCallback = js.Function2[/* now */ DOMHighResTimeStamp, /* metadata */ VideoFrameMetadata, Unit]

type VoidFunction = js.Function0[Unit]

type WebKitCSSMatrix = DOMMatrix

type WindowProxy = org.scalajs.dom.Window

type XMLHttpRequestBodyInit = org.scalajs.dom.Blob | BufferSource | org.scalajs.dom.FormData | URLSearchParams | java.lang.String

/** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
type XPathEvaluator = XPathEvaluatorBase

type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]) | LookupNamespaceURI

type webkitURL = org.scalajs.dom.URL
