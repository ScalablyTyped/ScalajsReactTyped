package typingsJapgolly.thenRequest

import typingsJapgolly.httpBasic.libHttpVerbMod.HttpVerb
import typingsJapgolly.thenRequest.libOptionsMod.Options
import typingsJapgolly.thenRequest.libResponsePromiseMod.ResponsePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRequestFnMod {
  
  type RequestFn = js.Function3[
    /* method */ HttpVerb, 
    /* url */ String, 
    /* options */ js.UndefOr[Options], 
    ResponsePromise
  ]
}
