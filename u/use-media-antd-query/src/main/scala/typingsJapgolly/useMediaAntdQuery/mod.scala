package typingsJapgolly.useMediaAntdQuery

import typingsJapgolly.useMediaAntdQuery.anon.MatchMedia
import typingsJapgolly.useMediaAntdQuery.anon.MaxWidth
import typingsJapgolly.useMediaAntdQuery.anon.MinWidth
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-media-antd-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): xs | sm | md | lg | xl | xxl = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[xs | sm | md | lg | xl | xxl]
  
  object MediaQueryEnum {
    
    @JSImport("use-media-antd-query", "MediaQueryEnum")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.lg")
    @js.native
    def lg: MaxWidth = js.native
    inline def lg_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.md")
    @js.native
    def md: MaxWidth = js.native
    inline def md_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.sm")
    @js.native
    def sm: MaxWidth = js.native
    inline def sm_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xl")
    @js.native
    def xl: MaxWidth = js.native
    inline def xl_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xl")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xs")
    @js.native
    def xs: MatchMedia = js.native
    inline def xs_=(x: MatchMedia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xs")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xxl")
    @js.native
    def xxl: MinWidth = js.native
    inline def xxl_=(x: MinWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xxl")(x.asInstanceOf[js.Any])
  }
  
  inline def getScreenClassName(): xs | sm | md | lg | xl | xxl = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenClassName")().asInstanceOf[xs | sm | md | lg | xl | xxl]
  
  /* keyof use-media-antd-query.anon.Lg */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xs
    - typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.sm
    - typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.md
    - typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.lg
    - typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xl
    - typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
  */
  trait MediaQueryKey extends StObject
}
