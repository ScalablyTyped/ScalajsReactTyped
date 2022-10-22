package typingsJapgolly.babylonjs

import org.scalajs.dom.AudioContext
import org.scalajs.dom.Event
import org.scalajs.dom.IDBFactory
import typingsJapgolly.babylonjs.babylonjsStrings.vrdisplayconnected
import typingsJapgolly.babylonjs.babylonjsStrings.vrdisplaydisconnected
import typingsJapgolly.babylonjs.babylonjsStrings.vrdisplaypresentchange
import typingsJapgolly.std.Float32ArrayConstructor
import typingsJapgolly.std.FrameRequestCallback
import typingsJapgolly.std.Uint8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* eslint-disable no-var */
/* eslint-disable @typescript-eslint/naming-convention */
// Mixins
@js.native
trait Window extends StObject {
  
  var AudioContext: org.scalajs.dom.AudioContext = js.native
  
  var CANNON: Any = js.native
  
  var DracoDecoderModule: Any = js.native
  
  var Float32Array: Float32ArrayConstructor = js.native
  
  var Math: typingsJapgolly.babylonjs.Math = js.native
  
  var PointerEvent: Any = js.native
  
  var Uint8Array: Uint8ArrayConstructor = js.native
  
  var WebGLRenderingContext: org.scalajs.dom.WebGLRenderingContext = js.native
  
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(`type`: vrdisplayconnected, listener: js.Function1[/* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnected(`type`: vrdisplayconnected, listener: js.Function1[/* ev */ Event, Any], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(`type`: vrdisplaydisconnected, listener: js.Function1[/* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnected(`type`: vrdisplaydisconnected, listener: js.Function1[/* ev */ Event, Any], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(`type`: vrdisplaypresentchange, listener: js.Function1[/* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(`type`: vrdisplaypresentchange, listener: js.Function1[/* ev */ Event, Any], useCapture: Boolean): Unit = js.native
  
  var mozIndexedDB: IDBFactory = js.native
  
  def mozRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  var mozURL: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URL :infer T} ? T : {readonly createObjectURL (blob : node.node:buffer.Blob): string, readonly revokeObjectURL (objectUrl : string): void} & new (input : string, base : string | node.url.URL | undefined): node.url.URL */ js.Any = js.native
  
  var msIndexedDB: IDBFactory = js.native
  
  var msURL: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URL :infer T} ? T : {readonly createObjectURL (blob : node.node:buffer.Blob): string, readonly revokeObjectURL (objectUrl : string): void} & new (input : string, base : string | node.url.URL | undefined): node.url.URL */ js.Any = js.native
  
  def oRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  var onvrdisplayconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  var onvrdisplaydisconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  def setImmediate(handler: js.Function1[/* repeated */ Any, Unit]): Double = js.native
  
  var webkitAudioContext: AudioContext = js.native
  
  var webkitIndexedDB: IDBFactory = js.native
  
  var webkitURL: /* import warning: importer.ImportType#apply Failed type conversion: / * globalThis * / any extends {  onmessage :any,   URL :infer T} ? T : {readonly createObjectURL (blob : node.node:buffer.Blob): string, readonly revokeObjectURL (objectUrl : string): void} & new (input : string, base : string | node.url.URL | undefined): node.url.URL */ js.Any = js.native
}
