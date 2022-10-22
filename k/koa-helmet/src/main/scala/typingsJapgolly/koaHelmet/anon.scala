package typingsJapgolly.koaHelmet

import typingsJapgolly.helmet.anon.ReadonlyContentSecurityPo
import typingsJapgolly.helmet.anon.ReadonlyCrossOriginEmbedd
import typingsJapgolly.helmet.anon.ReadonlyCrossOriginOpener
import typingsJapgolly.helmet.anon.ReadonlyCrossOriginResour
import typingsJapgolly.helmet.anon.ReadonlyExpectCtOptions
import typingsJapgolly.helmet.anon.ReadonlyHelmetOptions
import typingsJapgolly.helmet.anon.ReadonlyReferrerPolicyOpt
import typingsJapgolly.helmet.anon.ReadonlyStrictTransportSe
import typingsJapgolly.helmet.anon.ReadonlyXDnsPrefetchContr
import typingsJapgolly.helmet.anon.ReadonlyXFrameOptionsOpti
import typingsJapgolly.helmet.anon.ReadonlyXPermittedCrossDo
import typingsJapgolly.helmet.distTypesMiddlewaresContentSecurityPolicyMod.ContentSecurityPolicy
import typingsJapgolly.helmet.mod.Helmet
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofhelmet extends StObject {
    
    def default(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
        Unit
      ] = js.native
    def default(options: ReadonlyHelmetOptions): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
        Unit
      ] = js.native
    
    def contentSecurityPolicy(): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
        Unit
      ] = js.native
    def contentSecurityPolicy(options: ReadonlyContentSecurityPo): js.Function3[
        /* req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
        Unit
      ] = js.native
    @JSName("contentSecurityPolicy")
    val contentSecurityPolicy_Original: ContentSecurityPolicy = js.native
    
    def crossOriginEmbedderPolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def crossOriginEmbedderPolicy(options: ReadonlyCrossOriginEmbedd): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def crossOriginOpenerPolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def crossOriginOpenerPolicy(options: ReadonlyCrossOriginOpener): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def crossOriginResourcePolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def crossOriginResourcePolicy(options: ReadonlyCrossOriginResour): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    @JSName("default")
    val default_Original: Helmet = js.native
    
    def dnsPrefetchControl(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def dnsPrefetchControl(options: ReadonlyXDnsPrefetchContr): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def expectCt(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def expectCt(options: ReadonlyExpectCtOptions): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def frameguard(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def frameguard(options: ReadonlyXFrameOptionsOpti): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def hidePoweredBy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def hsts(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def hsts(options: ReadonlyStrictTransportSe): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def ieNoOpen(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def noSniff(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def originAgentCluster(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def permittedCrossDomainPolicies(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def permittedCrossDomainPolicies(options: ReadonlyXPermittedCrossDo): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def referrerPolicy(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    def referrerPolicy(options: ReadonlyReferrerPolicyOpt): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
    
    def xssFilter(): js.Function3[
        /* _req */ IncomingMessage, 
        /* res */ ServerResponse[IncomingMessage], 
        /* next */ js.Function0[Unit], 
        Unit
      ] = js.native
  }
}
