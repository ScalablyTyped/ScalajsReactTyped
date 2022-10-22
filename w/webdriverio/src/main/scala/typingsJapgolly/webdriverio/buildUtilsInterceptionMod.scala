package typingsJapgolly.webdriverio

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typingsJapgolly.webdriverio.buildTypesMod.WaitForOptions
import typingsJapgolly.webdriverio.buildUtilsInterceptionTypesMod.Matches
import typingsJapgolly.webdriverio.buildUtilsInterceptionTypesMod.MockFilterOptions
import typingsJapgolly.webdriverio.buildUtilsInterceptionTypesMod.MockOverwrite
import typingsJapgolly.webdriverio.buildUtilsInterceptionTypesMod.MockResponseParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsInterceptionMod {
  
  /* note: abstract class */ @JSImport("webdriverio/build/utils/interception", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Interception {
    def this(
      url: String,
      filterOptions: MockFilterOptions,
      browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ) = this()
    def this(
      url: js.RegExp,
      filterOptions: MockFilterOptions,
      browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/utils/interception", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def isMatchingRequest(expectedUrl: String, actualUrl: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingRequest")(expectedUrl.asInstanceOf[js.Any], actualUrl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isMatchingRequest(expectedUrl: js.RegExp, actualUrl: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingRequest")(expectedUrl.asInstanceOf[js.Any], actualUrl.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @js.native
  trait Interception extends StObject {
    
    def abort(errorReason: ErrorReason, sticky: Boolean): Unit = js.native
    
    def abortOnce(errorReason: ErrorReason): Unit = js.native
    
    var browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any = js.native
    
    var calls: js.Array[Matches] | js.Promise[js.Array[Matches]] = js.native
    
    def clear(): Unit = js.native
    
    var filterOptions: MockFilterOptions = js.native
    
    var matches: js.Array[Matches] = js.native
    
    def respond(overwrite: MockOverwrite, params: MockResponseParams): Unit = js.native
    
    def respondOnce(overwrite: MockOverwrite, params: MockResponseParams): Unit = js.native
    
    var respondOverwrites: js.Array[typingsJapgolly.webdriverio.anon.ErrorReason] = js.native
    
    def restore(): Unit = js.native
    
    var url: String | js.RegExp = js.native
    
    def waitForResponse(): js.Promise[Boolean | js.Promise[Boolean]] = js.native
    def waitForResponse(hasTimeoutIntervalTimeoutMsg: WaitForOptions): js.Promise[Boolean | js.Promise[Boolean]] = js.native
  }
}
