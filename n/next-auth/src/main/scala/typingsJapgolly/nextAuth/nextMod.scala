package typingsJapgolly.nextAuth

import typingsJapgolly.next.anon.CookiesNextApiRequestCookies
import typingsJapgolly.next.distSharedLibUtilsMod.NextApiRequest
import typingsJapgolly.next.distSharedLibUtilsMod.NextApiResponse
import typingsJapgolly.nextAuth.coreTypesMod.NextAuthOptions
import typingsJapgolly.nextAuth.coreTypesMod.Session
import typingsJapgolly.nextAuth.nextAuthStrings.`1`
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextMod {
  
  @JSImport("next-auth/next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: NextAuthOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(req: NextApiRequest, res: NextApiResponse[Any], options: NextAuthOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unstableGetServerSession(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [GetServerSidePropsContext['req'], GetServerSidePropsContext['res'], NextAuthOptions] | [NextApiRequest, NextApiResponse, NextAuthOptions] is not an array type */ args: js.Tuple3[
      (IncomingMessage & CookiesNextApiRequestCookies) | NextApiRequest, 
      NextApiResponse[Any] | ServerResponse[IncomingMessage], 
      NextAuthOptions
    ]
  ): js.Promise[Session | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getServerSession")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Session | Null]]
  
  object global {
    
    object NodeJS {
      
      trait ProcessEnv extends StObject {
        
        var NEXTAUTH_URL: js.UndefOr[String] = js.undefined
        
        var VERCEL: js.UndefOr[`1`] = js.undefined
      }
      object ProcessEnv {
        
        inline def apply(): ProcessEnv = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProcessEnv]
        }
        
        extension [Self <: ProcessEnv](x: Self) {
          
          inline def setNEXTAUTH_URL(value: String): Self = StObject.set(x, "NEXTAUTH_URL", value.asInstanceOf[js.Any])
          
          inline def setNEXTAUTH_URLUndefined: Self = StObject.set(x, "NEXTAUTH_URL", js.undefined)
          
          inline def setVERCEL(value: `1`): Self = StObject.set(x, "VERCEL", value.asInstanceOf[js.Any])
          
          inline def setVERCELUndefined: Self = StObject.set(x, "VERCEL", js.undefined)
        }
      }
    }
  }
}
