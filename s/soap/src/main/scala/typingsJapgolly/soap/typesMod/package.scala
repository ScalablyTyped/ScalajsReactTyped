package typingsJapgolly.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type IHeaders = org.scalablytyped.runtime.StringDictionary[js.Any]
  type IService = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.soap.typesMod.IServicePort]
  type IServicePort = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.soap.typesMod.ISoapServiceMethod]
  type IServices = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.soap.typesMod.IService]
  type ISoapMethod = typingsJapgolly.soap.typesMod.SoapMethod
  type ISoapServiceMethod = js.Function4[
    /* args */ js.Any, 
    /* callback */ js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]], 
    /* headers */ js.UndefOr[js.Any], 
    /* req */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Option = typingsJapgolly.soap.typesMod.IOptions
  type Security = typingsJapgolly.soap.typesMod.ISecurity
  type SoapMethod = js.Function4[
    /* args */ js.Any, 
    /* callback */ js.Function5[
      /* err */ js.Any, 
      /* result */ js.Any, 
      /* rawResponse */ js.Any, 
      /* soapHeader */ js.Any, 
      /* rawRequest */ js.Any, 
      scala.Unit
    ], 
    /* options */ js.UndefOr[js.Any], 
    /* extraHeaders */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
