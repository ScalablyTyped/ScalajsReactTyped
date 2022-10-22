package typingsJapgolly.domWebcodecs

import org.scalajs.dom.Blob
import org.scalajs.dom.DOMException
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.ImageData
import org.scalajs.dom.ReadableStream
import typingsJapgolly.std.HTMLOrSVGImageElement
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllowSharedBufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView

type AudioDataOutputCallback = js.Function1[/* output */ AudioData, Unit]

/**
  * Replaces CanvasImageSource; only applies if WebCodecs is available.
  */
type CanvasImageSourceWebCodecs = HTMLOrSVGImageElement | HTMLVideoElement | HTMLCanvasElement | ImageBitmap | EventTarget | VideoFrame

type EncodedAudioChunkOutputCallback = js.Function2[/* output */ EncodedAudioChunk, /* metadata */ EncodedAudioChunkMetadata, Unit]

type EncodedVideoChunkOutputCallback = js.Function2[/* chunk */ EncodedVideoChunk, /* metadata */ EncodedVideoChunkMetadata, Unit]

/**
  * Replaces ImageBitmapSource; only applies if WebCodecs is available.
  */
type ImageBitmapSourceWebCodecs = CanvasImageSourceWebCodecs | Blob | ImageData

type ImageBufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | ReadableStream[Any]

// The following declarations are copied from
// https://github.com/microsoft/TypeScript-DOM-lib-generator/blob/a75338e1ea8a958bf08a5745141d2ab8f14ba2ca/baselines/dom.generated.d.ts
// and modified to expand the types to include VideoFrame.
/** Shim for OffscreenCanvas, which was removed in TS 4.4 */
// tslint:disable-next-line:no-empty-interface
type OffscreenCanvas = EventTarget

/**
  * Replaces TexImageSource; only applies if WebCodecs is available.
  */
type TexImageSourceWebCodecs = ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | EventTarget | VideoFrame

type VideoFrameOutputCallback = js.Function1[/* output */ VideoFrame, Unit]

type WebCodecsErrorCallback = js.Function1[/* error */ DOMException, Unit]
