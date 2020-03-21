package typingsJapgolly.web3Core.mod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.web3CoreHelpers.mod.HttpProviderOptions
import typingsJapgolly.web3CoreHelpers.mod.WebsocketProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Providers extends js.Object {
  var HttpProvider: Instantiable2[
    /* host */ String, 
    js.UndefOr[/* options */ HttpProviderOptions], 
    typingsJapgolly.web3Core.mod.HttpProvider
  ]
  var IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, typingsJapgolly.web3Core.mod.IpcProvider]
  var WebsocketProvider: Instantiable2[
    /* host */ String, 
    js.UndefOr[/* options */ WebsocketProviderOptions], 
    typingsJapgolly.web3Core.mod.WebsocketProvider
  ]
}

object Providers {
  @scala.inline
  def apply(
    HttpProvider: Instantiable2[/* host */ String, js.UndefOr[/* options */ HttpProviderOptions], HttpProvider],
    IpcProvider: Instantiable2[/* path */ String, /* net */ js.Any, IpcProvider],
    WebsocketProvider: Instantiable2[
      /* host */ String, 
      js.UndefOr[/* options */ WebsocketProviderOptions], 
      WebsocketProvider
    ]
  ): Providers = {
    val __obj = js.Dynamic.literal(HttpProvider = HttpProvider.asInstanceOf[js.Any], IpcProvider = IpcProvider.asInstanceOf[js.Any], WebsocketProvider = WebsocketProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Providers]
  }
}

