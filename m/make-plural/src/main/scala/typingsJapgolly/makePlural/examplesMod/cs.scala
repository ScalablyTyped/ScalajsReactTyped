package typingsJapgolly.makePlural.examplesMod

import typingsJapgolly.makePlural.anon.FewManyOne
import typingsJapgolly.makePlural.anon.Other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cs {
  
  @JSImport("make-plural/examples", "cs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("make-plural/examples", "cs.cardinal")
  @js.native
  def cardinal: FewManyOne = js.native
  inline def cardinal_=(x: FewManyOne): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cardinal")(x.asInstanceOf[js.Any])
  
  @JSImport("make-plural/examples", "cs.ordinal")
  @js.native
  def ordinal: Other = js.native
  inline def ordinal_=(x: Other): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ordinal")(x.asInstanceOf[js.Any])
}
