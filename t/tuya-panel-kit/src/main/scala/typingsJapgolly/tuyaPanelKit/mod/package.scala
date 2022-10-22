package typingsJapgolly.tuyaPanelKit.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.InstanceType
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationOptions
import typingsJapgolly.tuyaPanelKit.anon.ActiveStyle
import typingsJapgolly.tuyaPanelKit.anon.DpId
import typingsJapgolly.tuyaPanelKit.anon.OmitNavigationContainerPr
import typingsJapgolly.tuyaPanelKit.mod.^
import typingsJapgolly.tuyaPanelKit.themeMod.GlobalTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Strings: InstanceType[
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam LanMap */ /* config */ Any, 
  I18NCore[
    I18NLanMap, 
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: RewrittenClass.unapply cls was tparam LanMap * / any[keyof / * import warning: RewrittenClass.unapply cls was tparam LanMap * / any] */ js.Any
  ]
]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Strings").asInstanceOf[InstanceType[
Instantiable1[
  /* import warning: RewrittenClass.unapply cls was tparam LanMap */ /* config */ Any, 
  I18NCore[
    I18NLanMap, 
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: RewrittenClass.unapply cls was tparam LanMap * / any[keyof / * import warning: RewrittenClass.unapply cls was tparam LanMap * / any] */ js.Any
  ]
]]]
inline def Strings_=(
  x: InstanceType[
  Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam LanMap */ /* config */ Any, 
    I18NCore[
      I18NLanMap, 
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: RewrittenClass.unapply cls was tparam LanMap * / any[keyof / * import warning: RewrittenClass.unapply cls was tparam LanMap * / any] */ js.Any
    ]
  ]
]
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Strings")(x.asInstanceOf[js.Any])

inline def createNavigator[P, S](createNavigatorParam: NavigationParam): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(createNavigatorParam.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def createNavigator[P, S](createNavigatorParam: NavigationParam, navigationContainerProps: OmitNavigationContainerPr): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(createNavigatorParam.asInstanceOf[js.Any], navigationContainerProps.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def defaultTheme: GlobalTheme = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTheme").asInstanceOf[GlobalTheme]
inline def defaultTheme_=(x: GlobalTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(x.asInstanceOf[js.Any])

inline def useTheme(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.Object]

type DialogAlertProps = DialogProps

type DpValue = Boolean | Double | String

type GotoDpAlarmData = js.Array[DpId]

type LinearGradientBackgroundOffset = StringDictionary[String]

type ScreenOptions = StackNavigationOptions | (js.Function1[
/* props */ typingsJapgolly.tuyaPanelKit.anon.NavigationRoute, 
StackNavigationOptions])

type StringType = StringDictionary[String]

type TabBarArr = NumberDictionary[ActiveStyle]
