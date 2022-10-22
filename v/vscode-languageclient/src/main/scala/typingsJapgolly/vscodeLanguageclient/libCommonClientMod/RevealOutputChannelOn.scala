package typingsJapgolly.vscodeLanguageclient.libCommonClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RevealOutputChannelOn extends StObject
@JSImport("vscode-languageclient/lib/common/client", "RevealOutputChannelOn")
@js.native
object RevealOutputChannelOn extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RevealOutputChannelOn & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with RevealOutputChannelOn
  /* 3 */ val Error: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.RevealOutputChannelOn.Error & Double = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with RevealOutputChannelOn
  /* 1 */ val Info: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.RevealOutputChannelOn.Info & Double = js.native
  
  @js.native
  sealed trait Never
    extends StObject
       with RevealOutputChannelOn
  /* 4 */ val Never: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.RevealOutputChannelOn.Never & Double = js.native
  
  @js.native
  sealed trait Warn
    extends StObject
       with RevealOutputChannelOn
  /* 2 */ val Warn: typingsJapgolly.vscodeLanguageclient.libCommonClientMod.RevealOutputChannelOn.Warn & Double = js.native
}
