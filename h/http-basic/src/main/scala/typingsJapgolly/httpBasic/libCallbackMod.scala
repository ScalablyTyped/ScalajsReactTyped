package typingsJapgolly.httpBasic

import typingsJapgolly.httpResponseObject.mod.^
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCallbackMod {
  
  type Callback = js.Function2[/* err */ ErrnoException | Null, /* response */ js.UndefOr[^[ReadableStream]], Unit]
}
