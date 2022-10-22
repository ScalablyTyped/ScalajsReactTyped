package typingsJapgolly.reactLazylog

import typingsJapgolly.reactLazylog.anon.PartialLazyLogProps
import typingsJapgolly.reactLazylog.anon.PartialSearchBarProps
import typingsJapgolly.reactLazylog.buildLazyLogMod.LazyLogProps
import typingsJapgolly.reactLazylog.buildScrollFollowMod.ScrollFollowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lazylog", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.reactLazylog.buildSearchBarMod.default
  /* static members */
  object default {
    
    @JSImport("react-lazylog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog", "default.defaultProps")
    @js.native
    def defaultProps: PartialSearchBarProps = js.native
    inline def defaultProps_=(x: PartialSearchBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-lazylog", "LazyLog")
  @js.native
  open class LazyLog protected ()
    extends typingsJapgolly.reactLazylog.buildLazyLogMod.LazyLog {
    def this(props: LazyLogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LazyLogProps, context: Any) = this()
  }
  /* static members */
  object LazyLog {
    
    @JSImport("react-lazylog", "LazyLog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog", "LazyLog.defaultProps")
    @js.native
    def defaultProps: PartialLazyLogProps = js.native
    inline def defaultProps_=(x: PartialLazyLogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-lazylog", "ScrollFollow")
  @js.native
  open class ScrollFollow protected ()
    extends typingsJapgolly.reactLazylog.buildScrollFollowMod.ScrollFollow {
    def this(props: ScrollFollowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollFollowProps, context: Any) = this()
  }
}
