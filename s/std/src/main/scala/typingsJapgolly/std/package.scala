package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type AAGUID = typingsJapgolly.std.BufferSource
  type AlgorithmIdentifier = java.lang.String | org.scalajs.dom.crypto.Algorithm
  type AudioWorklet = typingsJapgolly.std.Worklet
  type AuthenticationExtensionsSupported = js.Array[java.lang.String]
  type AuthenticatorSelectionList = js.Array[typingsJapgolly.std.AAGUID]
  type AutoKeyword = typingsJapgolly.std.stdStrings.auto
  type BigInteger = scala.scalajs.js.typedarray.Uint8Array
  type BlobCallback = js.Function1[/* blob */ org.scalajs.dom.raw.Blob | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.BufferSource
    - typingsJapgolly.std.Blob
    - java.lang.String
  */
  type BlobPart = typingsJapgolly.std._BlobPart | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.Blob
    - typingsJapgolly.std.BufferSource
    - typingsJapgolly.std.FormData
    - typingsJapgolly.std.URLSearchParams
    - typingsJapgolly.std.ReadableStream[typingsJapgolly.std.Uint8Array]
    - java.lang.String
  */
  type BodyInit = typingsJapgolly.std._BodyInit | org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | java.lang.String
  /** A CDATA section that can be used within XML to include extended portions of unescaped text. The symbols < and & don’t need escaping as they normally do when inside a CDATA section. */
  type CDATASection = org.scalajs.dom.raw.Text
  type COSEAlgorithmIdentifier = scala.Double
  /** An object representing a single CSS @supports at-rule. It implements the CSSConditionRule interface, and therefore the CSSRule and CSSGroupingRule interfaces with a type value of 12 (CSSRule.SUPPORTS_RULE). */
  type CSSSupportsRule = typingsJapgolly.std.CSSConditionRule
  /** The ChannelMergerNode interface, often used in conjunction with its opposite, ChannelSplitterNode, reunites different mono inputs into a single output. Each input is used to fill a channel of the output. This is useful for accessing each channels separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelMergerNode = org.scalajs.dom.raw.AudioNode
  /** The ChannelSplitterNode interface, often used in conjunction with its opposite, ChannelMergerNode, separates the different channels of an audio source into a set of mono outputs. This is useful for accessing each channel separately, e.g. for performing channel mixing where gain must be separately controlled on each channel. */
  type ChannelSplitterNode = org.scalajs.dom.raw.AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  /** Textual notations within markup; although it is generally not visually shown, such comments are available to be read in the source view. */
  type Comment = org.scalajs.dom.raw.CharacterData
  type ConstrainBoolean = scala.Boolean | typingsJapgolly.std.ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | typingsJapgolly.std.ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | typingsJapgolly.std.ConstrainDoubleRange
  type ConstrainULong = scala.Double | typingsJapgolly.std.ConstrainULongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = scala.Double
  /** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ org.scalajs.dom.raw.DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalajs.dom.raw.AudioBuffer, scala.Unit]
  type DocumentTimeline = typingsJapgolly.std.AnimationTimeline
  /** @deprecated Directly use HTMLElementTagNameMap or SVGElementTagNameMap as appropriate, instead. */
  type ElementTagNameMap = typingsJapgolly.std.HTMLElementTagNameMap with (typingsJapgolly.std.Pick[
    typingsJapgolly.std.SVGElementTagNameMap, 
    typingsJapgolly.std.Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ]
  ])
  type EvalError = js.Error
  type EventHandlerNonNull = js.Function1[/* event */ typingsJapgolly.std.Event_, js.Any]
  type EventListener = js.Function1[/* evt */ typingsJapgolly.std.Event_, scala.Unit]
  type EventListenerOrEventListenerObject = typingsJapgolly.std.EventListener | typingsJapgolly.std.EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type Float32List = scala.scalajs.js.typedarray.Float32Array | js.Array[typingsJapgolly.std.GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.ArrayBuffer | scala.Null, 
    /* status */ typingsJapgolly.std.MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = org.scalajs.dom.raw.File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLint64 = scala.Double
  type GLintptr = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLuint = scala.Double
  type GLuint64 = scala.Double
  type GamepadHapticActuatorType = typingsJapgolly.std.stdStrings.vibration
  type HashAlgorithmIdentifier = typingsJapgolly.std.AlgorithmIdentifier
  type HeadersInit = org.scalajs.dom.experimental.Headers | js.Array[js.Array[java.lang.String]] | (typingsJapgolly.std.Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - typingsJapgolly.std.Date
    - typingsJapgolly.std.BufferSource
    - typingsJapgolly.std.IDBArrayKey
  */
  type IDBValidKey = typingsJapgolly.std._IDBValidKey | scala.Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args */ js.Any, js.Any] */] = js.Any
  type Int32List = scala.scalajs.js.typedarray.Int32Array | js.Array[typingsJapgolly.std.GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[typingsJapgolly.std.IntersectionObserverEntry], 
    /* observer */ typingsJapgolly.std.IntersectionObserver, 
    scala.Unit
  ]
  type LineAndPositionSetting = scala.Double | typingsJapgolly.std.AutoKeyword
  type MSCredentialType = typingsJapgolly.std.stdStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MediaStreamTrackAudioSourceNode = org.scalajs.dom.raw.AudioNode
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.std.WindowProxy
    - typingsJapgolly.std.MessagePort
    - typingsJapgolly.std.ServiceWorker
  */
  type MessageEventSource = typingsJapgolly.std._MessageEventSource | typingsJapgolly.std.WindowProxy
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typingsJapgolly.std.TypedPropertyDescriptor[js.Any], 
    typingsJapgolly.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = org.scalajs.dom.raw.WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalajs.dom.raw.MutationRecord], 
    /* observer */ org.scalajs.dom.raw.MutationObserver, 
    scala.Unit
  ]
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ typingsJapgolly.std.MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ org.scalajs.dom.experimental.mediastream.MediaStream, scala.Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationPermissionCallback = js.Function1[/* permission */ typingsJapgolly.std.NotificationPermission, scala.Unit]
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type OnBeforeUnloadEventHandler = typingsJapgolly.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ typingsJapgolly.std.Event_, java.lang.String | scala.Null]
  type OnErrorEventHandler = typingsJapgolly.std.OnErrorEventHandlerNonNull | scala.Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ typingsJapgolly.std.Event_ | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Error], 
    js.Any
  ]
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsJapgolly.std.stdStrings.Partial with T
  type PaymentRequestUpdateEventInit = typingsJapgolly.std.EventInit
  type PerformanceEntryList = js.Array[org.scalajs.dom.raw.PerformanceEntry]
  /** PerformanceMark is an abstract interface for PerformanceEntry objects with an entryType of "mark". Entries of this type are created by calling performance.mark() to add a named DOMHighResTimeStamp (the mark) to the browser's performance timeline. */
  type PerformanceMark = org.scalajs.dom.raw.PerformanceEntry
  /** PerformanceMeasure is an abstract interface for PerformanceEntry objects with an entryType of "measure". Entries of this type are created by calling performance.measure() to add a named DOMHighResTimeStamp (the measure) between two marks to the browser's performance timeline. */
  type PerformanceMeasure = org.scalajs.dom.raw.PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ typingsJapgolly.std.PerformanceObserverEntryList, 
    /* observer */ typingsJapgolly.std.PerformanceObserver, 
    scala.Unit
  ]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ typingsJapgolly.std.stdStrings.Pick with T
  type PositionCallback = js.Function1[/* position */ org.scalajs.dom.raw.Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ org.scalajs.dom.raw.PositionError, scala.Unit]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[js.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type PublicKeyCredentialType = typingsJapgolly.std.stdStrings.`public-key`
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = typingsJapgolly.std.RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalajs.dom.raw.DOMException, scala.Unit]
  type RTCRtpDecodingParameters = typingsJapgolly.std.RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[
    /* description */ org.scalajs.dom.experimental.webrtc.RTCSessionDescriptionInit, 
    scala.Unit
  ]
  type RTCStatsCallback = js.Function1[/* report */ org.scalajs.dom.experimental.webrtc.RTCStatsReport, scala.Unit]
  type RangeError = js.Error
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ typingsJapgolly.std.ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ typingsJapgolly.std.ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ typingsJapgolly.std.stdStrings.Readonly with T
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
  type ReferenceError = js.Error
  type RequestInfo = org.scalajs.dom.experimental.Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ typingsJapgolly.std.stdStrings.Required with T
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* args */ js.Any, _] */] = js.Any
  type SVGMatrix = typingsJapgolly.std.DOMMatrix
  type SVGPathSegClosePath = org.scalajs.dom.raw.SVGPathSeg
  type SVGPoint = typingsJapgolly.std.DOMPoint
  type SVGRect = typingsJapgolly.std.DOMRect
  type ScopedCredentialType = typingsJapgolly.std.stdStrings.ScopedCred
  type StaticRange = typingsJapgolly.std.AbstractRange
  type SyntaxError = js.Error
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | js.Function
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ typingsJapgolly.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ typingsJapgolly.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TypeError = js.Error
  type URIError = js.Error
  type Uint32List = scala.scalajs.js.typedarray.Uint32Array | js.Array[typingsJapgolly.std.GLuint]
  type UvmEntries = js.Array[typingsJapgolly.std.UvmEntry]
  type UvmEntry = js.Array[scala.Double]
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VoidFunction = js.Function0[scala.Unit]
  /** Part of the WebGL API and represents an opaque buffer object storing data such as vertices or colors. */
  type WebGLBuffer = typingsJapgolly.std.WebGLObject
  /** Part of the WebGL API and represents a collection of buffers that serve as a rendering destination. */
  type WebGLFramebuffer = typingsJapgolly.std.WebGLObject
  /** The WebGLProgram is part of the WebGL API and is a combination of two compiled WebGLShaders consisting of a vertex shader and a fragment shader (both written in GLSL). */
  type WebGLProgram = typingsJapgolly.std.WebGLObject
  type WebGLQuery = typingsJapgolly.std.WebGLObject
  /** Part of the WebGL API and represents a buffer that can contain an image, or can be source or target of an rendering operation. */
  type WebGLRenderbuffer = typingsJapgolly.std.WebGLObject
  type WebGLSampler = typingsJapgolly.std.WebGLObject
  /** The WebGLShader is part of the WebGL API and can either be a vertex or a fragment shader. A WebGLProgram requires both types of shaders. */
  type WebGLShader = typingsJapgolly.std.WebGLObject
  type WebGLSync = typingsJapgolly.std.WebGLObject
  /** Part of the WebGL API and represents an opaque texture object providing storage and state for texturing operations. */
  type WebGLTexture = typingsJapgolly.std.WebGLObject
  type WebGLTransformFeedback = typingsJapgolly.std.WebGLObject
  type WebGLVertexArrayObject = typingsJapgolly.std.WebGLObject
  type WebGLVertexArrayObjectOES = typingsJapgolly.std.WebGLObject
  type WebKitCSSMatrix = typingsJapgolly.std.DOMMatrix
  type WindowProxy = typingsJapgolly.std.Window_
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ typingsJapgolly.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ typingsJapgolly.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  /** The XPathEvaluator interface allows to compile and evaluate XPath expressions. */
  type XPathEvaluator = typingsJapgolly.std.XPathEvaluatorBase
  type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | scala.Null, java.lang.String | scala.Null]) | typingsJapgolly.std.AnonLookupNamespaceURI
  type webkitURL = org.scalajs.dom.experimental.URL
}
