package typingsJapgolly.ethers.libEthersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ethers/lib/ethers", "Wordlist")
@js.native
open class Wordlist protected ()
  extends typingsJapgolly.ethersprojectWordlists.mod.Wordlist {
  def this(locale: String) = this()
}
/* static members */
object Wordlist {
  
  @JSImport("ethers/lib/ethers", "Wordlist")
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(wordlist: typingsJapgolly.ethersprojectWordlists.libWordlistMod.Wordlist): String = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(wordlist.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def register(lang: typingsJapgolly.ethersprojectWordlists.libWordlistMod.Wordlist): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(lang.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def register(lang: typingsJapgolly.ethersprojectWordlists.libWordlistMod.Wordlist, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(lang.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
