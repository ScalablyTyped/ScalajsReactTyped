package typingsJapgolly.reactImgix.mod

import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLSourceElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.SourceHTMLAttributes
import typingsJapgolly.reactImgix.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Background: FunctionComponent[PropsWithChildren[BackgroundProps]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Background").asInstanceOf[FunctionComponent[PropsWithChildren[BackgroundProps]]]

inline def buildURL(src: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any]).asInstanceOf[String]
inline def buildURL(src: String, imgixParams: Unit, options: SharedImgixAndSourceProps): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildURL(src: String, imgixParams: ImgixParams): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildURL(src: String, imgixParams: ImgixParams, options: SharedImgixAndSourceProps): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

type Imgix = Component[SharedImgixAndSourceProps & js.Object, js.Object]

type ImgixHTMLAttributes = ImgHTMLAttributes[HTMLImageElement] | SourceHTMLAttributes[HTMLSourceElement] | (Record[String, String])

type ImgixParamType = String | Double | Boolean
