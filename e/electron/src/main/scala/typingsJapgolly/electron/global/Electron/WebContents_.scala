package typingsJapgolly.electron.global.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.WebContents")
@js.native
open class WebContents_ ()
  extends typingsJapgolly.electron.Electron.WebContents_
object WebContents_ {
  
  @JSGlobal("Electron.WebContents")
  @js.native
  val ^ : js.Any = js.native
  
  // Docs: https://electronjs.org/docs/api/web-contents
  /**
    * | undefined - A WebContents instance with the given TargetID, or `undefined` if
    * there is no WebContents associated with the given TargetID.
    *
    * When communicating with the Chrome DevTools Protocol, it can be useful to lookup
    * a WebContents instance based on its assigned TargetID.
    */
  /* static member */
  inline def fromDevToolsTargetId(targetId: String): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDevToolsTargetId")(targetId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
  
  /**
    * | undefined - A WebContents instance with the given WebFrameMain, or `undefined`
    * if there is no WebContents associated with the given WebFrameMain.
    */
  /* static member */
  inline def fromFrame(frame: typingsJapgolly.electron.Electron.WebFrameMain_): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
  
  /**
    * | undefined - A WebContents instance with the given ID, or `undefined` if there
    * is no WebContents associated with the given ID.
    */
  /* static member */
  inline def fromId(id: Double): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fromId")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
  
  /**
    * An array of all `WebContents` instances. This will contain web contents for all
    * windows, webviews, opened devtools, and devtools extension background pages.
    */
  /* static member */
  inline def getAllWebContents(): js.Array[typingsJapgolly.electron.Electron.WebContents_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllWebContents")().asInstanceOf[js.Array[typingsJapgolly.electron.Electron.WebContents_]]
  
  /**
    * | null - The web contents that is focused in this application, otherwise returns
    * `null`.
    */
  /* static member */
  inline def getFocusedWebContents(): typingsJapgolly.electron.Electron.WebContents_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedWebContents")().asInstanceOf[typingsJapgolly.electron.Electron.WebContents_]
}
