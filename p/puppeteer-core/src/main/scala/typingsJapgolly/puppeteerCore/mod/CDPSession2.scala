package typingsJapgolly.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CDPSession2 extends EventEmitter {
  
  @JSName("send")
  def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 534, starting with typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ConsoleDotclearMessages, typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ConsoleDotdisable, typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ConsoleDotenable */ Any */](
    method: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
  ] = js.native
}
