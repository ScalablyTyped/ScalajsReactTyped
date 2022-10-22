package typingsJapgolly.angularCommon.mod

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`img[ngSrc]Commaimg[rawSrc]`
import typingsJapgolly.angularCommon.angularCommonStrings.`lazy`
import typingsJapgolly.angularCommon.angularCommonStrings.auto
import typingsJapgolly.angularCommon.angularCommonStrings.eager
import typingsJapgolly.angularCommon.anon.Height
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.OnInit
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgOptimizedImage")
@js.native
open class NgOptimizedImage ()
  extends StObject
     with OnInit
     with OnChanges
     with OnDestroy {
  
  /* private */ var _height: Any = js.native
  
  /* private */ var _priority: Any = js.native
  
  /**
    * Calculate the rewritten `src` once and store it.
    * This is needed to avoid repetitive calculations and make sure the directive cleanup in the
    * `ngOnDestroy` does not rely on the `IMAGE_LOADER` logic (which in turn can rely on some other
    * instance that might be already destroyed).
    */
  /* private */ var _renderedSrc: Any = js.native
  
  /* private */ var _width: Any = js.native
  
  /* private */ var getFetchPriority: Any = js.native
  
  /* private */ var getLoadingBehavior: Any = js.native
  
  /* private */ var getRewrittenSrc: Any = js.native
  
  /* private */ var getRewrittenSrcset: Any = js.native
  
  def height: js.UndefOr[Double] = js.native
  /**
    * The intrinsic height of the image in pixels.
    */
  def height_=(value: js.UndefOr[String | Double]): Unit = js.native
  
  /* private */ var imageLoader: Any = js.native
  
  /* private */ var imgElement: Any = js.native
  
  /* private */ var injector: Any = js.native
  
  /* private */ var lcpObserver: Any = js.native
  
  /**
    * The desired loading behavior (lazy, eager, or auto).
    *
    * Setting images as loading='eager' or loading='auto' marks them
    * as non-priority images. Avoid changing this input for priority images.
    */
  var loading: js.UndefOr[`lazy` | eager | auto] = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): Unit = js.native
  
  /**
    * Name of the source image.
    * Image name will be processed by the image loader and the final URL will be applied as the `src`
    * property of the image.
    */
  var ngSrc: String = js.native
  
  /**
    * A comma separated list of width or density descriptors.
    * The image name will be taken from `ngSrc` and combined with the list of width or density
    * descriptors to generate the final `srcset` property of the image.
    *
    * Example:
    * ```
    * <img ngSrc="hello.jpg" ngSrcset="100w, 200w" />  =>
    * <img src="path/hello.jpg" srcset="path/hello.jpg?w=100 100w, path/hello.jpg?w=200 200w" />
    * ```
    */
  var ngSrcset: String = js.native
  
  def priority: Boolean = js.native
  /**
    * Indicates whether this image should have a high priority.
    */
  def priority_=(value: js.UndefOr[String | Boolean]): Unit = js.native
  
  /**
    * Previously, the `rawSrc` attribute was used to activate the directive.
    * The attribute was renamed to `ngSrc` and this input just produces an error,
    * suggesting to switch to `ngSrc` instead.
    *
    * This error should be removed in v15.
    *
    * @nodoc
    * @deprecated Use `ngSrc` instead.
    */
  def rawSrc_=(value: String): Unit = js.native
  
  /* private */ var renderer: Any = js.native
  
  /* private */ var setHostAttribute: Any = js.native
  
  /* private */ var setHostAttributes: Any = js.native
  
  def width: js.UndefOr[Double] = js.native
  /**
    * The intrinsic width of the image in pixels.
    */
  def width_=(value: js.UndefOr[String | Double]): Unit = js.native
}
/* static members */
object NgOptimizedImage {
  
  @JSImport("@angular/common", "NgOptimizedImage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgOptimizedImage.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgOptimizedImage, 
    `img[ngSrc]Commaimg[rawSrc]`, 
    scala.Nothing, 
    Height, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgOptimizedImage, 
      `img[ngSrc]Commaimg[rawSrc]`, 
      scala.Nothing, 
      Height, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgOptimizedImage.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgOptimizedImage, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgOptimizedImage, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
