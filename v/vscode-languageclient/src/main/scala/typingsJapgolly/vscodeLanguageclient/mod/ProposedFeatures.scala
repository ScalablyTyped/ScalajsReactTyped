package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.libCommonClientMod.LanguageClientOptions
import typingsJapgolly.vscodeLanguageclient.libCommonClientMod.Middleware
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProposedFeatures {
  
  @JSImport("vscode-languageclient", "ProposedFeatures")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAll(_client: FeatureClient[Middleware, LanguageClientOptions]): js.Array[
    typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.StaticFeature | typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAll")(_client.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.StaticFeature | typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature[Any]
  ]]
}
