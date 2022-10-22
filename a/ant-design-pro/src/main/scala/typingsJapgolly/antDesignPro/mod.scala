package typingsJapgolly.antDesignPro

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.antDesignPro.anon.TypeofAuthorized
import typingsJapgolly.antDesignPro.anon.TypeofTagSelectOption
import typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.AvatarItemProps
import typingsJapgolly.antDesignPro.libAvatarListMod.default
import typingsJapgolly.antDesignPro.libLoginLoginItemMod.LoginItemProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ant-design-pro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Authorized(currentAuthority: String): TypeofAuthorized = ^.asInstanceOf[js.Dynamic].applyDynamic("Authorized")(currentAuthority.asInstanceOf[js.Any]).asInstanceOf[TypeofAuthorized]
  
  @JSImport("ant-design-pro", "AvatarList")
  @js.native
  open class AvatarList () extends default
  /* static members */
  object AvatarList {
    
    @JSImport("ant-design-pro", "AvatarList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "AvatarList.Item")
    @js.native
    def Item: Instantiable1[
        /* props */ AvatarItemProps, 
        typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.default
      ] = js.native
    inline def Item_=(
      x: Instantiable1[
          /* props */ AvatarItemProps, 
          typingsJapgolly.antDesignPro.libAvatarListAvatarItemMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "CountDown")
  @js.native
  open class CountDown ()
    extends typingsJapgolly.antDesignPro.libCountDownMod.default
  
  @JSImport("ant-design-pro", "DescriptionList")
  @js.native
  open class DescriptionList ()
    extends typingsJapgolly.antDesignPro.libDescriptionListMod.default
  /* static members */
  object DescriptionList {
    
    @JSImport("ant-design-pro", "DescriptionList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "DescriptionList.Description")
    @js.native
    def Description: Instantiable0[typingsJapgolly.antDesignPro.libDescriptionListDescriptionMod.default] = js.native
    inline def Description_=(x: Instantiable0[typingsJapgolly.antDesignPro.libDescriptionListDescriptionMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "Ellipsis")
  @js.native
  open class Ellipsis ()
    extends typingsJapgolly.antDesignPro.libEllipsisMod.default
  
  @JSImport("ant-design-pro", "Exception")
  @js.native
  open class Exception ()
    extends typingsJapgolly.antDesignPro.libExceptionMod.default
  
  @JSImport("ant-design-pro", "FooterToolbar")
  @js.native
  open class FooterToolbar ()
    extends typingsJapgolly.antDesignPro.libFooterToolbarMod.default
  
  @JSImport("ant-design-pro", "GlobalFooter")
  @js.native
  open class GlobalFooter ()
    extends typingsJapgolly.antDesignPro.libGlobalFooterMod.default
  
  @JSImport("ant-design-pro", "HeaderDropdown")
  @js.native
  open class HeaderDropdown ()
    extends typingsJapgolly.antDesignPro.libHeaderDropdownMod.default
  
  @JSImport("ant-design-pro", "HeaderSearch")
  @js.native
  open class HeaderSearch ()
    extends typingsJapgolly.antDesignPro.libHeaderSearchMod.default
  
  @JSImport("ant-design-pro", "Login")
  @js.native
  open class Login ()
    extends typingsJapgolly.antDesignPro.libLoginMod.default
  object Login {
    
    @JSImport("ant-design-pro", "Login")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Captcha")
    @js.native
    def Captcha: FC[LoginItemProps] = js.native
    inline def Captcha_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Captcha")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Mobile")
    @js.native
    def Mobile: FC[LoginItemProps] = js.native
    inline def Mobile_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mobile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Password")
    @js.native
    def Password: FC[LoginItemProps] = js.native
    inline def Password_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Password")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("ant-design-pro", "Login.Submit")
    @js.native
    def Submit: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof LoginSubmit */ Any = js.native
    inline def Submit_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof LoginSubmit */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Submit")(x.asInstanceOf[js.Any])
    
    /* was `typeof LoginTab` */
    @JSImport("ant-design-pro", "Login.Tab")
    @js.native
    open class Tab ()
      extends typingsJapgolly.antDesignPro.libLoginMod.default.Tab
    
    /* static member */
    @JSImport("ant-design-pro", "Login.UserName")
    @js.native
    def UserName: FC[LoginItemProps] = js.native
    inline def UserName_=(x: FC[LoginItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UserName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "NoticeIcon")
  @js.native
  open class NoticeIcon ()
    extends typingsJapgolly.antDesignPro.libNoticeIconMod.default
  /* static members */
  object NoticeIcon {
    
    @JSImport("ant-design-pro", "NoticeIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "NoticeIcon.Tab")
    @js.native
    def Tab: Instantiable0[typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.default] = js.native
    inline def Tab_=(x: Instantiable0[typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "NumberInfo")
  @js.native
  open class NumberInfo ()
    extends typingsJapgolly.antDesignPro.libNumberInfoMod.default
  
  @JSImport("ant-design-pro", "PageHeader")
  @js.native
  open class PageHeader ()
    extends typingsJapgolly.antDesignPro.libPageHeaderMod.default
  
  @JSImport("ant-design-pro", "Result")
  @js.native
  open class Result ()
    extends typingsJapgolly.antDesignPro.libResultMod.default
  
  @JSImport("ant-design-pro", "TagSelect")
  @js.native
  open class TagSelect ()
    extends typingsJapgolly.antDesignPro.libTagSelectMod.default
  /* static members */
  object TagSelect {
    
    @JSImport("ant-design-pro", "TagSelect")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro", "TagSelect.Option")
    @js.native
    def Option: TypeofTagSelectOption = js.native
    inline def Option_=(x: TypeofTagSelectOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ant-design-pro", "Trend")
  @js.native
  open class Trend ()
    extends typingsJapgolly.antDesignPro.libTrendMod.default
}
