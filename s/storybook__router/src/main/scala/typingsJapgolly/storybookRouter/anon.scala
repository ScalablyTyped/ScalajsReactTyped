package typingsJapgolly.storybookRouter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMStringList
import typingsJapgolly.react.mod.HTMLAttributeAnchorTarget
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.Hash
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.Key
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.Pathname
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsActive extends StObject {
    
    var isActive: Boolean
  }
  object IsActive {
    
    inline def apply(isActive: Boolean): IsActive = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsActive]
    }
    
    extension [Self <: IsActive](x: Self) {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@storybook/router.@storybook/router/dist/ts3.9/_modules/react-router-node_modules-history-index.Location> */
  trait PartialLocation extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object PartialLocation {
    
    inline def apply(): PartialLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocation]
    }
    
    extension [Self <: PartialLocation](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Location> */
  trait PartialLocationAncestorOrigins extends StObject {
    
    var ancestorOrigins: js.UndefOr[DOMStringList] = js.undefined
    
    var assign: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var reload: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var replace: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    @JSName("toString")
    var toString_FPartialLocationAncestorOrigins: js.UndefOr[js.Function0[String]] = js.undefined
  }
  object PartialLocationAncestorOrigins {
    
    inline def apply(): PartialLocationAncestorOrigins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLocationAncestorOrigins]
    }
    
    extension [Self <: PartialLocationAncestorOrigins](x: Self) {
      
      inline def setAncestorOrigins(value: DOMStringList): Self = StObject.set(x, "ancestorOrigins", value.asInstanceOf[js.Any])
      
      inline def setAncestorOriginsUndefined: Self = StObject.set(x, "ancestorOrigins", js.undefined)
      
      inline def setAssign(value: /* url */ String => Callback): Self = StObject.set(x, "assign", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
      
      inline def setAssignUndefined: Self = StObject.set(x, "assign", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setReload(value: Callback): Self = StObject.set(x, "reload", value.toJsFn)
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
      
      inline def setReplace(value: /* url */ String => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@storybook/router.@storybook/router/dist/ts3.9/_modules/react-router-node_modules-history-index.Path> */
  trait PartialPath extends StObject {
    
    var hash: js.UndefOr[Hash] = js.undefined
    
    var pathname: js.UndefOr[Pathname] = js.undefined
    
    var search: js.UndefOr[Search] = js.undefined
  }
  object PartialPath {
    
    inline def apply(): PartialPath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPath]
    }
    
    extension [Self <: PartialPath](x: Self) {
      
      inline def setHash(value: Hash): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPathname(value: Pathname): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plain extends StObject {
    
    var plain: js.UndefOr[Boolean] = js.undefined
  }
  object Plain {
    
    inline def apply(): Plain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plain]
    }
    
    extension [Self <: Plain](x: Self) {
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    }
  }
  
  trait Replace extends StObject {
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
    
    var target: js.UndefOr[HTMLAttributeAnchorTarget] = js.undefined
  }
  object Replace {
    
    inline def apply(): Replace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Replace]
    }
    
    extension [Self <: Replace](x: Self) {
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTarget(value: HTMLAttributeAnchorTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
