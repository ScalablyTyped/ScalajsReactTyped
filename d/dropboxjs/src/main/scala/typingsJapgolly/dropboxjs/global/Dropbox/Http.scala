package typingsJapgolly.dropboxjs.global.Dropbox

import typingsJapgolly.dropboxjs.Dropbox.File.Stat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Http {
  
  @JSGlobal("Dropbox.Http.AppInfo")
  @js.native
  open class AppInfo ()
    extends StObject
       with typingsJapgolly.dropboxjs.Dropbox.Http.AppInfo
  object AppInfo {
    
    @JSGlobal("Dropbox.Http.AppInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Dropbox.Http.AppInfo.ICON_LARGE")
    @js.native
    def ICON_LARGE: Double = js.native
    inline def ICON_LARGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_LARGE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropbox.Http.AppInfo.ICON_SMALL")
    @js.native
    def ICON_SMALL: Double = js.native
    inline def ICON_SMALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_SMALL")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def parse(appInfo: js.Object): typingsJapgolly.dropboxjs.Dropbox.Http.AppInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(appInfo.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.AppInfo]
    inline def parse(appInfo: js.Object, appKey: String): typingsJapgolly.dropboxjs.Dropbox.Http.AppInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(appInfo.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.AppInfo]
  }
  
  @JSGlobal("Dropbox.Http.PollResult")
  @js.native
  open class PollResult ()
    extends StObject
       with typingsJapgolly.dropboxjs.Dropbox.Http.PollResult {
    
    /* CompleteClass */
    var hasChanges: Boolean = js.native
    
    /* CompleteClass */
    var retryAfter: Double = js.native
  }
  object PollResult {
    
    @JSGlobal("Dropbox.Http.PollResult")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(response: js.Object): typingsJapgolly.dropboxjs.Dropbox.Http.PollResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(response.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.PollResult]
  }
  
  @JSGlobal("Dropbox.Http.PulledChange")
  @js.native
  open class PulledChange ()
    extends StObject
       with typingsJapgolly.dropboxjs.Dropbox.Http.PulledChange {
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var stat: Stat = js.native
    
    /* CompleteClass */
    var wasRemoved: Boolean = js.native
  }
  object PulledChange {
    
    @JSGlobal("Dropbox.Http.PulledChange")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(entry: js.Object): typingsJapgolly.dropboxjs.Dropbox.Http.PulledChange = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(entry.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.PulledChange]
  }
  
  @JSGlobal("Dropbox.Http.PulledChanges")
  @js.native
  open class PulledChanges ()
    extends StObject
       with typingsJapgolly.dropboxjs.Dropbox.Http.PulledChanges {
    
    /* CompleteClass */
    var blankSlate: Boolean = js.native
    
    /* CompleteClass */
    override def cursor(): String = js.native
    
    /* CompleteClass */
    var cursorTag: String = js.native
    
    /* CompleteClass */
    var shouldBackOff: Boolean = js.native
    
    /* CompleteClass */
    var shouldPullAgain: Boolean = js.native
  }
  object PulledChanges {
    
    @JSGlobal("Dropbox.Http.PulledChanges")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(deltaInfo: js.Object): typingsJapgolly.dropboxjs.Dropbox.Http.PulledChanges = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(deltaInfo.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.PulledChanges]
  }
  
  @JSGlobal("Dropbox.Http.RangeInfo")
  @js.native
  open class RangeInfo ()
    extends StObject
       with typingsJapgolly.dropboxjs.Dropbox.Http.RangeInfo {
    
    /* CompleteClass */
    var end: Double = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    var start: Double = js.native
  }
  object RangeInfo {
    
    @JSGlobal("Dropbox.Http.RangeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(headerValue: String): typingsJapgolly.dropboxjs.Dropbox.Http.RangeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(headerValue.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.RangeInfo]
  }
  
  @JSGlobal("Dropbox.Http.UploadCursor")
  @js.native
  open class UploadCursor protected ()
    extends StObject
       with typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor {
    def this(cursorData: String) = this()
    def this(cursorData: js.Object) = this()
    
    /* CompleteClass */
    var expiresAt: js.Date = js.native
    
    /* CompleteClass */
    var offset: Double = js.native
    
    /* CompleteClass */
    var tag: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  object UploadCursor {
    
    @JSGlobal("Dropbox.Http.UploadCursor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(cursorData: String): typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cursorData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor]
    /* static member */
    inline def parse(cursorData: js.Object): typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(cursorData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor]
  }
}
