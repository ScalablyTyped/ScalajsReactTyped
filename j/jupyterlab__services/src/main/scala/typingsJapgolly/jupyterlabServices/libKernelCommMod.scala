package typingsJapgolly.jupyterlabServices

import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsJapgolly.jupyterlabServices.libKernelKernelMod.IComm
import typingsJapgolly.jupyterlabServices.libKernelKernelMod.IKernelConnection
import typingsJapgolly.jupyterlabServices.libKernelKernelMod.IShellFuture
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommCloseMsg
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ICommMsgMsg
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.IShellMessage
import typingsJapgolly.jupyterlabServices.libKernelMessagesMod.ShellMessageType
import typingsJapgolly.luminoCoreutils.typesJsonMod.JSONObject
import typingsJapgolly.luminoDisposable.mod.DisposableDelegate
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelCommMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/comm", "CommHandler")
  @js.native
  open class CommHandler protected ()
    extends DisposableDelegate
       with IComm {
    /**
      * Construct a new comm channel.
      */
    def this(target: String, id: String, kernel: IKernelConnection, disposeCb: js.Function0[Unit]) = this()
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _kernel: Any = js.native
    
    /* private */ var _onClose: Any = js.native
    
    /* private */ var _onMsg: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    def close(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(
      data: JSONObject,
      metadata: Unit,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def close(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The unique id for the comm channel.
      */
    @JSName("commId")
    def commId_MCommHandler: String = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * Get the callback for a comm close event.
      *
      * #### Notes
      * This is called when the comm is closed from either the server or client.
      *
      * **See also:** [[ICommClose]], [[close]]
      */
    def onClose: js.Function1[/* msg */ ICommCloseMsg[iopub | shell], Unit | PromiseLike[Unit]] = js.native
    /**
      * Set the callback for a comm close event.
      *
      * #### Notes
      * This is called when the comm is closed from either the server or client. If
      * the function returns a promise, and the kernel was closed from the server,
      * kernel message processing will pause until the returned promise is
      * fulfilled.
      *
      * **See also:** [[close]]
      */
    def onClose_=(cb: js.Function1[/* msg */ ICommCloseMsg[iopub | shell], Unit | PromiseLike[Unit]]): Unit = js.native
    
    /**
      * Get the callback for a comm message received event.
      */
    def onMsg: js.Function1[/* msg */ ICommMsgMsg[iopub | shell], Unit | PromiseLike[Unit]] = js.native
    /**
      * Set the callback for a comm message received event.
      *
      * #### Notes
      * This is called when a comm message is received. If the function returns a
      * promise, kernel message processing will pause until it is fulfilled.
      */
    def onMsg_=(cb: js.Function1[/* msg */ ICommMsgMsg[iopub | shell], Unit | PromiseLike[Unit]]): Unit = js.native
    
    def open(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(
      data: JSONObject,
      metadata: Unit,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def open(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * Send a `comm_msg` message to the kernel.
      *
      * #### Notes
      * This is a no-op if the comm has been closed.
      *
      * **See also:** [[ICommMsg]]
      */
    def send(data: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: Unit,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: Unit,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: Unit, buffers: Unit, disposeOnDone: Boolean): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: JSONObject): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(
      data: JSONObject,
      metadata: JSONObject,
      buffers: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView],
      disposeOnDone: Boolean
    ): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    def send(data: JSONObject, metadata: JSONObject, buffers: Unit, disposeOnDone: Boolean): IShellFuture[IShellMessage[ShellMessageType], IShellMessage[ShellMessageType]] = js.native
    
    /**
      * The target name for the comm channel.
      */
    @JSName("targetName")
    def targetName_MCommHandler: String = js.native
  }
}
