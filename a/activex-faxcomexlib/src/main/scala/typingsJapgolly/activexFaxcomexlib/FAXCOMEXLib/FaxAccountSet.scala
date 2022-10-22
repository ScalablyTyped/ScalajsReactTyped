package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxAccountSet Class */
trait FaxAccountSet extends StObject {
  
  /** Adds a fax account */
  def AddAccount(bstrAccountName: String): FaxAccount
  
  /* private */ @JSName("FAXCOMEXLib.FaxAccountSet_typekey")
  var FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet
  
  /** Get fax account by name */
  def GetAccount(bstrAccountName: String): FaxAccount
  
  /** Collection of fax accounts */
  def GetAccounts(): FaxAccounts
  
  /** Removes a fax account by name */
  def RemoveAccount(bstrAccountName: String): Unit
}
object FaxAccountSet {
  
  inline def apply(
    AddAccount: String => FaxAccount,
    FAXCOMEXLibDotFaxAccountSet_typekey: FaxAccountSet,
    GetAccount: String => FaxAccount,
    GetAccounts: CallbackTo[FaxAccounts],
    RemoveAccount: String => Callback
  ): FaxAccountSet = {
    val __obj = js.Dynamic.literal(AddAccount = js.Any.fromFunction1(AddAccount), GetAccount = js.Any.fromFunction1(GetAccount), GetAccounts = GetAccounts.toJsFn, RemoveAccount = js.Any.fromFunction1((t0: String) => RemoveAccount(t0).runNow()))
    __obj.updateDynamic("FAXCOMEXLib.FaxAccountSet_typekey")(FAXCOMEXLibDotFaxAccountSet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxAccountSet]
  }
  
  extension [Self <: FaxAccountSet](x: Self) {
    
    inline def setAddAccount(value: String => FaxAccount): Self = StObject.set(x, "AddAccount", js.Any.fromFunction1(value))
    
    inline def setFAXCOMEXLibDotFaxAccountSet_typekey(value: FaxAccountSet): Self = StObject.set(x, "FAXCOMEXLib.FaxAccountSet_typekey", value.asInstanceOf[js.Any])
    
    inline def setGetAccount(value: String => FaxAccount): Self = StObject.set(x, "GetAccount", js.Any.fromFunction1(value))
    
    inline def setGetAccounts(value: CallbackTo[FaxAccounts]): Self = StObject.set(x, "GetAccounts", value.toJsFn)
    
    inline def setRemoveAccount(value: String => Callback): Self = StObject.set(x, "RemoveAccount", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
