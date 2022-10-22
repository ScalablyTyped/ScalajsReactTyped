package typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ClientCapabilities
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.ServerCapabilities
import typingsJapgolly.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticFeature extends StObject {
  
  /**
    * Called when the client is stopped to dispose this feature. Usually a feature
    * un-registers listeners registered hooked up with the VS Code extension host.
    */
  def dispose(): Unit = js.native
  
  /**
    * Called to fill in the client capabilities this feature implements.
    *
    * @param capabilities The client capabilities to fill.
    */
  def fillClientCapabilities(capabilities: ClientCapabilities): Unit = js.native
  
  /**
    * Called to fill the initialize params.
    *
    * @params the initialize params.
    */
  var fillInitializeParams: js.UndefOr[js.Function1[/* params */ InitializeParams, Unit]] = js.native
  
  /**
    * Returns the state the feature is in.
    */
  def getState(): FeatureState = js.native
  
  /**
    * Initialize the feature. This method is called on a feature instance
    * when the client has successfully received the initialize request from
    * the server and before the client sends the initialized notification
    * to the server.
    *
    * @param capabilities the server capabilities
    * @param documentSelector the document selector pass to the client's constructor.
    *  May be `undefined` if the client was created without a selector.
    */
  def initialize(capabilities: ServerCapabilities[LSPAny]): Unit = js.native
  def initialize(capabilities: ServerCapabilities[LSPAny], documentSelector: DocumentSelector): Unit = js.native
  
  /**
    * A preflight where the server capabilities are shown to all features
    * before a feature is actually initialized. This allows feature to
    * capture some state if they are a pre-requisite for other features.
    *
    * @param capabilities the server capabilities
    * @param documentSelector the document selector pass to the client's constructor.
    *  May be `undefined` if the client was created without a selector.
    */
  var preInitialize: js.UndefOr[
    js.Function2[
      /* capabilities */ ServerCapabilities[LSPAny], 
      /* documentSelector */ js.UndefOr[DocumentSelector], 
      Unit
    ]
  ] = js.native
}
object StaticFeature {
  
  @JSImport("vscode-languageclient/lib/common/features", "StaticFeature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def is(value: Any): /* is vscode-languageclient.vscode-languageclient/lib/common/features.StaticFeature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageclient.vscode-languageclient/lib/common/features.StaticFeature */ Boolean]
}
