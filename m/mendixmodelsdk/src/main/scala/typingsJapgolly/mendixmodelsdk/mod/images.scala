package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object images {
  
  @JSImport("mendixmodelsdk", "images.Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.images.Image {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Image {
    
    @JSImport("mendixmodelsdk", "images.Image")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.Image]
    
    /**
      * Creates and returns a new Image instance in the SDK and on the server.
      * The new Image will be automatically stored in the 'images' property
      * of the parent ImageCollection element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.ImageCollection): typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.Image]
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.Image.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.Image.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/images relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "images.ImageCollection")
  @js.native
  open class ImageCollection protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.images.ImageCollection {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ImageCollection {
    
    @JSImport("mendixmodelsdk", "images.ImageCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ImageCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.ImageCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.ImageCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.ImageCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.ImageCollection.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "images.MxImageFormat")
  @js.native
  open class MxImageFormat protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.images.MxImageFormat {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object MxImageFormat {
    
    @JSImport("mendixmodelsdk", "images.MxImageFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.MxImageFormat.Bmp")
    @js.native
    def Bmp: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Bmp_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bmp")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.MxImageFormat.Gif")
    @js.native
    def Gif: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Gif_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Gif")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.MxImageFormat.Jpg")
    @js.native
    def Jpg: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Jpg_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Jpg")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.MxImageFormat.Png")
    @js.native
    def Png: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Png_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Png")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.MxImageFormat.Svg")
    @js.native
    def Svg: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Svg_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Svg")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "images.MxImageFormat.Unknown")
    @js.native
    def Unknown: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat = js.native
    inline def Unknown_=(x: typingsJapgolly.mendixmodelsdk.srcGenImagesMod.images.MxImageFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
  }
}
