package typingsJapgolly.phaser.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.phaser.spine.Animation
import typingsJapgolly.phaser.spine.AnimationState
import typingsJapgolly.phaser.spine.AnimationStateAdapter2
import typingsJapgolly.phaser.spine.AnimationStateData
import typingsJapgolly.phaser.spine.AssetManager
import typingsJapgolly.phaser.spine.AtlasAttachmentLoader
import typingsJapgolly.phaser.spine.Attachment
import typingsJapgolly.phaser.spine.AttachmentLoader
import typingsJapgolly.phaser.spine.AttachmentTimeline
import typingsJapgolly.phaser.spine.Bone
import typingsJapgolly.phaser.spine.BoneData
import typingsJapgolly.phaser.spine.BoundingBoxAttachment
import typingsJapgolly.phaser.spine.ClippingAttachment
import typingsJapgolly.phaser.spine.Color
import typingsJapgolly.phaser.spine.ColorTimeline
import typingsJapgolly.phaser.spine.ConstraintData
import typingsJapgolly.phaser.spine.CurveTimeline
import typingsJapgolly.phaser.spine.DebugUtils
import typingsJapgolly.phaser.spine.DeformTimeline
import typingsJapgolly.phaser.spine.DrawOrderTimeline
import typingsJapgolly.phaser.spine.Event
import typingsJapgolly.phaser.spine.EventData
import typingsJapgolly.phaser.spine.EventQueue
import typingsJapgolly.phaser.spine.EventTimeline
import typingsJapgolly.phaser.spine.FakeTexture
import typingsJapgolly.phaser.spine.IkConstraint
import typingsJapgolly.phaser.spine.IkConstraintData
import typingsJapgolly.phaser.spine.IkConstraintTimeline
import typingsJapgolly.phaser.spine.IntSet
import typingsJapgolly.phaser.spine.Interpolation
import typingsJapgolly.phaser.spine.JitterEffect
import typingsJapgolly.phaser.spine.MathUtils
import typingsJapgolly.phaser.spine.MeshAttachment
import typingsJapgolly.phaser.spine.PathAttachment
import typingsJapgolly.phaser.spine.PathConstraint
import typingsJapgolly.phaser.spine.PathConstraintData
import typingsJapgolly.phaser.spine.PathConstraintMixTimeline
import typingsJapgolly.phaser.spine.PathConstraintPositionTimeline
import typingsJapgolly.phaser.spine.PathConstraintSpacingTimeline
import typingsJapgolly.phaser.spine.PointAttachment
import typingsJapgolly.phaser.spine.Pool
import typingsJapgolly.phaser.spine.Pow
import typingsJapgolly.phaser.spine.PowOut
import typingsJapgolly.phaser.spine.RegionAttachment
import typingsJapgolly.phaser.spine.RotateTimeline
import typingsJapgolly.phaser.spine.ScaleTimeline
import typingsJapgolly.phaser.spine.SharedAssetManager
import typingsJapgolly.phaser.spine.ShearTimeline
import typingsJapgolly.phaser.spine.Skeleton
import typingsJapgolly.phaser.spine.SkeletonBinary
import typingsJapgolly.phaser.spine.SkeletonBounds
import typingsJapgolly.phaser.spine.SkeletonClipping
import typingsJapgolly.phaser.spine.SkeletonData
import typingsJapgolly.phaser.spine.SkeletonJson
import typingsJapgolly.phaser.spine.Skin
import typingsJapgolly.phaser.spine.SkinEntry
import typingsJapgolly.phaser.spine.Slot
import typingsJapgolly.phaser.spine.SlotData
import typingsJapgolly.phaser.spine.SwirlEffect
import typingsJapgolly.phaser.spine.Texture
import typingsJapgolly.phaser.spine.TextureAtlas
import typingsJapgolly.phaser.spine.TextureAtlasPage
import typingsJapgolly.phaser.spine.TextureAtlasRegion
import typingsJapgolly.phaser.spine.TextureRegion
import typingsJapgolly.phaser.spine.TimeKeeper
import typingsJapgolly.phaser.spine.Timeline
import typingsJapgolly.phaser.spine.TrackEntry
import typingsJapgolly.phaser.spine.TransformConstraint
import typingsJapgolly.phaser.spine.TransformConstraintData
import typingsJapgolly.phaser.spine.TransformConstraintTimeline
import typingsJapgolly.phaser.spine.TranslateTimeline
import typingsJapgolly.phaser.spine.Triangulator
import typingsJapgolly.phaser.spine.TwoColorTimeline
import typingsJapgolly.phaser.spine.Utils
import typingsJapgolly.phaser.spine.Vector2
import typingsJapgolly.phaser.spine.VertexAttachment
import typingsJapgolly.phaser.spine.WindowedMean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofspine extends StObject {
  
  var Animation: (Instantiable3[
    /* name */ String, 
    /* timelines */ js.Array[Timeline], 
    /* duration */ Double, 
    typingsJapgolly.phaser.spine.Animation
  ]) & TypeofAnimation
  
  var AnimationState: (Instantiable1[/* data */ AnimationStateData, typingsJapgolly.phaser.spine.AnimationState]) & TypeofAnimationState
  
  var AnimationStateAdapter2: Instantiable0[typingsJapgolly.phaser.spine.AnimationStateAdapter2]
  
  var AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, typingsJapgolly.phaser.spine.AnimationStateData]
  
  var AssetManager: (Instantiable2[
    /* textureLoader */ js.Function1[/* image */ HTMLImageElement, Any], 
    /* pathPrefix */ js.UndefOr[String], 
    typingsJapgolly.phaser.spine.AssetManager
  ]) & TypeofAssetManager
  
  var AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, typingsJapgolly.phaser.spine.AtlasAttachmentLoader]
  
  var Attachment: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.Attachment]
  
  var AttachmentTimeline: Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.AttachmentTimeline]
  
  var Bone: Instantiable3[
    /* data */ BoneData, 
    /* skeleton */ Skeleton, 
    /* parent */ typingsJapgolly.phaser.spine.Bone, 
    typingsJapgolly.phaser.spine.Bone
  ]
  
  var BoneData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* parent */ typingsJapgolly.phaser.spine.BoneData, 
    typingsJapgolly.phaser.spine.BoneData
  ]
  
  var BoundingBoxAttachment: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.BoundingBoxAttachment]
  
  var ClippingAttachment: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.ClippingAttachment]
  
  var Color: (Instantiable4[
    /* r */ js.UndefOr[Double], 
    /* g */ js.UndefOr[Double], 
    /* b */ js.UndefOr[Double], 
    /* a */ js.UndefOr[Double], 
    typingsJapgolly.phaser.spine.Color
  ]) & TypeofColor
  
  var ColorTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.ColorTimeline]) & TypeofColorTimeline
  
  var ConstraintData: Instantiable3[
    /* name */ String, 
    /* order */ Double, 
    /* skinRequired */ Boolean, 
    typingsJapgolly.phaser.spine.ConstraintData
  ]
  
  var CurveTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.CurveTimeline]) & TypeofCurveTimeline
  
  var DebugUtils: Instantiable0[typingsJapgolly.phaser.spine.DebugUtils] & TypeofDebugUtils
  
  var DeformTimeline: Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.DeformTimeline]
  
  var DrawOrderTimeline: Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.DrawOrderTimeline]
  
  var Event: Instantiable2[/* time */ Double, /* data */ EventData, typingsJapgolly.phaser.spine.Event]
  
  var EventData: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.EventData]
  
  var EventQueue: Instantiable1[/* animState */ AnimationState, typingsJapgolly.phaser.spine.EventQueue]
  
  var EventTimeline: Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.EventTimeline]
  
  var FakeTexture: Instantiable0[typingsJapgolly.phaser.spine.FakeTexture]
  
  var IkConstraint: Instantiable2[
    /* data */ IkConstraintData, 
    /* skeleton */ Skeleton, 
    typingsJapgolly.phaser.spine.IkConstraint
  ]
  
  var IkConstraintData: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.IkConstraintData]
  
  var IkConstraintTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.IkConstraintTimeline]) & TypeofIkConstraintTimelin
  
  var IntSet: Instantiable0[typingsJapgolly.phaser.spine.IntSet]
  
  var Interpolation: Instantiable0[typingsJapgolly.phaser.spine.Interpolation]
  
  var JitterEffect: Instantiable2[
    /* jitterX */ Double, 
    /* jitterY */ Double, 
    typingsJapgolly.phaser.spine.JitterEffect
  ]
  
  var MathUtils: Instantiable0[typingsJapgolly.phaser.spine.MathUtils] & TypeofMathUtils
  
  var MeshAttachment: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.MeshAttachment]
  
  var PathAttachment: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.PathAttachment]
  
  var PathConstraint: (Instantiable2[
    /* data */ PathConstraintData, 
    /* skeleton */ Skeleton, 
    typingsJapgolly.phaser.spine.PathConstraint
  ]) & TypeofPathConstraint
  
  var PathConstraintData: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.PathConstraintData]
  
  var PathConstraintMixTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.PathConstraintMixTimeline]) & TypeofPathConstraintMixTi
  
  var PathConstraintPositionTimeline: (Instantiable1[
    /* frameCount */ Double, 
    typingsJapgolly.phaser.spine.PathConstraintPositionTimeline
  ]) & TypeofPathConstraintPosit
  
  var PathConstraintSpacingTimeline: Instantiable1[
    /* frameCount */ Double, 
    typingsJapgolly.phaser.spine.PathConstraintSpacingTimeline
  ]
  
  var PointAttachment: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.PointAttachment]
  
  var Pool: Instantiable1[
    /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
    typingsJapgolly.phaser.spine.Pool[js.Object]
  ]
  
  var Pow: Instantiable1[/* power */ Double, typingsJapgolly.phaser.spine.Pow]
  
  var PowOut: Instantiable1[/* power */ Double, typingsJapgolly.phaser.spine.PowOut]
  
  var RegionAttachment: (Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.RegionAttachment]) & TypeofRegionAttachment
  
  var RotateTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.RotateTimeline]) & TypeofRotateTimeline
  
  var ScaleTimeline: Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.ScaleTimeline]
  
  var SharedAssetManager: Instantiable1[
    /* pathPrefix */ js.UndefOr[String], 
    typingsJapgolly.phaser.spine.SharedAssetManager
  ]
  
  var ShearTimeline: Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.ShearTimeline]
  
  var Skeleton: Instantiable1[/* data */ SkeletonData, typingsJapgolly.phaser.spine.Skeleton]
  
  var SkeletonBinary: (Instantiable1[
    /* attachmentLoader */ AttachmentLoader, 
    typingsJapgolly.phaser.spine.SkeletonBinary
  ]) & TypeofSkeletonBinary
  
  var SkeletonBounds: Instantiable0[typingsJapgolly.phaser.spine.SkeletonBounds]
  
  var SkeletonClipping: Instantiable0[typingsJapgolly.phaser.spine.SkeletonClipping] & TypeofSkeletonClipping
  
  var SkeletonData: Instantiable0[typingsJapgolly.phaser.spine.SkeletonData]
  
  var SkeletonJson: (Instantiable1[/* attachmentLoader */ AttachmentLoader, typingsJapgolly.phaser.spine.SkeletonJson]) & TypeofSkeletonJson
  
  var Skin: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.Skin]
  
  var SkinEntry: Instantiable3[
    /* slotIndex */ Double, 
    /* name */ String, 
    /* attachment */ Attachment, 
    typingsJapgolly.phaser.spine.SkinEntry
  ]
  
  var Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, typingsJapgolly.phaser.spine.Slot]
  
  var SlotData: Instantiable3[
    /* index */ Double, 
    /* name */ String, 
    /* boneData */ BoneData, 
    typingsJapgolly.phaser.spine.SlotData
  ]
  
  var SwirlEffect: (Instantiable1[/* radius */ Double, typingsJapgolly.phaser.spine.SwirlEffect]) & TypeofSwirlEffect
  
  var Texture: (Instantiable1[/* image */ HTMLImageElement, typingsJapgolly.phaser.spine.Texture]) & TypeofTexture
  
  var TextureAtlas: Instantiable2[
    /* atlasText */ String, 
    /* textureLoader */ js.Function1[/* path */ String, Any], 
    typingsJapgolly.phaser.spine.TextureAtlas
  ]
  
  var TextureAtlasPage: Instantiable0[typingsJapgolly.phaser.spine.TextureAtlasPage]
  
  var TextureAtlasRegion: Instantiable0[typingsJapgolly.phaser.spine.TextureAtlasRegion]
  
  var TextureRegion: Instantiable0[typingsJapgolly.phaser.spine.TextureRegion]
  
  var TimeKeeper: Instantiable0[typingsJapgolly.phaser.spine.TimeKeeper]
  
  var TrackEntry: Instantiable0[typingsJapgolly.phaser.spine.TrackEntry]
  
  var TransformConstraint: Instantiable2[
    /* data */ TransformConstraintData, 
    /* skeleton */ Skeleton, 
    typingsJapgolly.phaser.spine.TransformConstraint
  ]
  
  var TransformConstraintData: Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.TransformConstraintData]
  
  var TransformConstraintTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.TransformConstraintTimeline]) & TypeofTransformConstraint
  
  var TranslateTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.TranslateTimeline]) & TypeofTranslateTimeline
  
  var Triangulator: Instantiable0[typingsJapgolly.phaser.spine.Triangulator] & TypeofTriangulator
  
  var TwoColorTimeline: (Instantiable1[/* frameCount */ Double, typingsJapgolly.phaser.spine.TwoColorTimeline]) & TypeofTwoColorTimeline
  
  var Utils: Instantiable0[typingsJapgolly.phaser.spine.Utils] & TypeofUtils
  
  var Vector2: Instantiable2[
    /* x */ js.UndefOr[Double], 
    /* y */ js.UndefOr[Double], 
    typingsJapgolly.phaser.spine.Vector2
  ]
  
  var VertexAttachment: (Instantiable1[/* name */ String, typingsJapgolly.phaser.spine.VertexAttachment]) & TypeofVertexAttachment
  
  var WindowedMean: Instantiable1[/* windowSize */ js.UndefOr[Double], typingsJapgolly.phaser.spine.WindowedMean]
  
  val canvas: Typeofcanvas
  
  val webgl: Typeofwebgl
}
object Typeofspine {
  
  inline def apply(
    Animation: (Instantiable3[
      /* name */ String, 
      /* timelines */ js.Array[Timeline], 
      /* duration */ Double, 
      Animation
    ]) & TypeofAnimation,
    AnimationState: (Instantiable1[/* data */ AnimationStateData, AnimationState]) & TypeofAnimationState,
    AnimationStateAdapter2: Instantiable0[AnimationStateAdapter2],
    AnimationStateData: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData],
    AssetManager: (Instantiable2[
      /* textureLoader */ js.Function1[/* image */ HTMLImageElement, Any], 
      /* pathPrefix */ js.UndefOr[String], 
      AssetManager
    ]) & TypeofAssetManager,
    AtlasAttachmentLoader: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader],
    Attachment: Instantiable1[/* name */ String, Attachment],
    AttachmentTimeline: Instantiable1[/* frameCount */ Double, AttachmentTimeline],
    Bone: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone],
    BoneData: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData],
    BoundingBoxAttachment: Instantiable1[/* name */ String, BoundingBoxAttachment],
    ClippingAttachment: Instantiable1[/* name */ String, ClippingAttachment],
    Color: (Instantiable4[
      /* r */ js.UndefOr[Double], 
      /* g */ js.UndefOr[Double], 
      /* b */ js.UndefOr[Double], 
      /* a */ js.UndefOr[Double], 
      Color
    ]) & TypeofColor,
    ColorTimeline: (Instantiable1[/* frameCount */ Double, ColorTimeline]) & TypeofColorTimeline,
    ConstraintData: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData],
    CurveTimeline: (Instantiable1[/* frameCount */ Double, CurveTimeline]) & TypeofCurveTimeline,
    DebugUtils: Instantiable0[DebugUtils] & TypeofDebugUtils,
    DeformTimeline: Instantiable1[/* frameCount */ Double, DeformTimeline],
    DrawOrderTimeline: Instantiable1[/* frameCount */ Double, DrawOrderTimeline],
    Event: Instantiable2[/* time */ Double, /* data */ EventData, Event],
    EventData: Instantiable1[/* name */ String, EventData],
    EventQueue: Instantiable1[/* animState */ AnimationState, EventQueue],
    EventTimeline: Instantiable1[/* frameCount */ Double, EventTimeline],
    FakeTexture: Instantiable0[FakeTexture],
    IkConstraint: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint],
    IkConstraintData: Instantiable1[/* name */ String, IkConstraintData],
    IkConstraintTimeline: (Instantiable1[/* frameCount */ Double, IkConstraintTimeline]) & TypeofIkConstraintTimelin,
    IntSet: Instantiable0[IntSet],
    Interpolation: Instantiable0[Interpolation],
    JitterEffect: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect],
    MathUtils: Instantiable0[MathUtils] & TypeofMathUtils,
    MeshAttachment: Instantiable1[/* name */ String, MeshAttachment],
    PathAttachment: Instantiable1[/* name */ String, PathAttachment],
    PathConstraint: (Instantiable2[/* data */ PathConstraintData, /* skeleton */ Skeleton, PathConstraint]) & TypeofPathConstraint,
    PathConstraintData: Instantiable1[/* name */ String, PathConstraintData],
    PathConstraintMixTimeline: (Instantiable1[/* frameCount */ Double, PathConstraintMixTimeline]) & TypeofPathConstraintMixTi,
    PathConstraintPositionTimeline: (Instantiable1[/* frameCount */ Double, PathConstraintPositionTimeline]) & TypeofPathConstraintPosit,
    PathConstraintSpacingTimeline: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline],
    PointAttachment: Instantiable1[/* name */ String, PointAttachment],
    Pool: Instantiable1[
      /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
      Pool[js.Object]
    ],
    Pow: Instantiable1[/* power */ Double, Pow],
    PowOut: Instantiable1[/* power */ Double, PowOut],
    RegionAttachment: (Instantiable1[/* name */ String, RegionAttachment]) & TypeofRegionAttachment,
    RotateTimeline: (Instantiable1[/* frameCount */ Double, RotateTimeline]) & TypeofRotateTimeline,
    ScaleTimeline: Instantiable1[/* frameCount */ Double, ScaleTimeline],
    SharedAssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], SharedAssetManager],
    ShearTimeline: Instantiable1[/* frameCount */ Double, ShearTimeline],
    Skeleton: Instantiable1[/* data */ SkeletonData, Skeleton],
    SkeletonBinary: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonBinary]) & TypeofSkeletonBinary,
    SkeletonBounds: Instantiable0[SkeletonBounds],
    SkeletonClipping: Instantiable0[SkeletonClipping] & TypeofSkeletonClipping,
    SkeletonData: Instantiable0[SkeletonData],
    SkeletonJson: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson]) & TypeofSkeletonJson,
    Skin: Instantiable1[/* name */ String, Skin],
    SkinEntry: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry],
    Slot: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot],
    SlotData: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData],
    SwirlEffect: (Instantiable1[/* radius */ Double, SwirlEffect]) & TypeofSwirlEffect,
    Texture: (Instantiable1[/* image */ HTMLImageElement, Texture]) & TypeofTexture,
    TextureAtlas: Instantiable2[
      /* atlasText */ String, 
      /* textureLoader */ js.Function1[/* path */ String, Any], 
      TextureAtlas
    ],
    TextureAtlasPage: Instantiable0[TextureAtlasPage],
    TextureAtlasRegion: Instantiable0[TextureAtlasRegion],
    TextureRegion: Instantiable0[TextureRegion],
    TimeKeeper: Instantiable0[TimeKeeper],
    TrackEntry: Instantiable0[TrackEntry],
    TransformConstraint: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint],
    TransformConstraintData: Instantiable1[/* name */ String, TransformConstraintData],
    TransformConstraintTimeline: (Instantiable1[/* frameCount */ Double, TransformConstraintTimeline]) & TypeofTransformConstraint,
    TranslateTimeline: (Instantiable1[/* frameCount */ Double, TranslateTimeline]) & TypeofTranslateTimeline,
    Triangulator: Instantiable0[Triangulator] & TypeofTriangulator,
    TwoColorTimeline: (Instantiable1[/* frameCount */ Double, TwoColorTimeline]) & TypeofTwoColorTimeline,
    Utils: Instantiable0[Utils] & TypeofUtils,
    Vector2: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Vector2],
    VertexAttachment: (Instantiable1[/* name */ String, VertexAttachment]) & TypeofVertexAttachment,
    WindowedMean: Instantiable1[/* windowSize */ js.UndefOr[Double], WindowedMean],
    canvas: Typeofcanvas,
    webgl: Typeofwebgl
  ): Typeofspine = {
    val __obj = js.Dynamic.literal(Animation = Animation.asInstanceOf[js.Any], AnimationState = AnimationState.asInstanceOf[js.Any], AnimationStateAdapter2 = AnimationStateAdapter2.asInstanceOf[js.Any], AnimationStateData = AnimationStateData.asInstanceOf[js.Any], AssetManager = AssetManager.asInstanceOf[js.Any], AtlasAttachmentLoader = AtlasAttachmentLoader.asInstanceOf[js.Any], Attachment = Attachment.asInstanceOf[js.Any], AttachmentTimeline = AttachmentTimeline.asInstanceOf[js.Any], Bone = Bone.asInstanceOf[js.Any], BoneData = BoneData.asInstanceOf[js.Any], BoundingBoxAttachment = BoundingBoxAttachment.asInstanceOf[js.Any], ClippingAttachment = ClippingAttachment.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorTimeline = ColorTimeline.asInstanceOf[js.Any], ConstraintData = ConstraintData.asInstanceOf[js.Any], CurveTimeline = CurveTimeline.asInstanceOf[js.Any], DebugUtils = DebugUtils.asInstanceOf[js.Any], DeformTimeline = DeformTimeline.asInstanceOf[js.Any], DrawOrderTimeline = DrawOrderTimeline.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], EventQueue = EventQueue.asInstanceOf[js.Any], EventTimeline = EventTimeline.asInstanceOf[js.Any], FakeTexture = FakeTexture.asInstanceOf[js.Any], IkConstraint = IkConstraint.asInstanceOf[js.Any], IkConstraintData = IkConstraintData.asInstanceOf[js.Any], IkConstraintTimeline = IkConstraintTimeline.asInstanceOf[js.Any], IntSet = IntSet.asInstanceOf[js.Any], Interpolation = Interpolation.asInstanceOf[js.Any], JitterEffect = JitterEffect.asInstanceOf[js.Any], MathUtils = MathUtils.asInstanceOf[js.Any], MeshAttachment = MeshAttachment.asInstanceOf[js.Any], PathAttachment = PathAttachment.asInstanceOf[js.Any], PathConstraint = PathConstraint.asInstanceOf[js.Any], PathConstraintData = PathConstraintData.asInstanceOf[js.Any], PathConstraintMixTimeline = PathConstraintMixTimeline.asInstanceOf[js.Any], PathConstraintPositionTimeline = PathConstraintPositionTimeline.asInstanceOf[js.Any], PathConstraintSpacingTimeline = PathConstraintSpacingTimeline.asInstanceOf[js.Any], PointAttachment = PointAttachment.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Pow = Pow.asInstanceOf[js.Any], PowOut = PowOut.asInstanceOf[js.Any], RegionAttachment = RegionAttachment.asInstanceOf[js.Any], RotateTimeline = RotateTimeline.asInstanceOf[js.Any], ScaleTimeline = ScaleTimeline.asInstanceOf[js.Any], SharedAssetManager = SharedAssetManager.asInstanceOf[js.Any], ShearTimeline = ShearTimeline.asInstanceOf[js.Any], Skeleton = Skeleton.asInstanceOf[js.Any], SkeletonBinary = SkeletonBinary.asInstanceOf[js.Any], SkeletonBounds = SkeletonBounds.asInstanceOf[js.Any], SkeletonClipping = SkeletonClipping.asInstanceOf[js.Any], SkeletonData = SkeletonData.asInstanceOf[js.Any], SkeletonJson = SkeletonJson.asInstanceOf[js.Any], Skin = Skin.asInstanceOf[js.Any], SkinEntry = SkinEntry.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any], SlotData = SlotData.asInstanceOf[js.Any], SwirlEffect = SwirlEffect.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any], TextureAtlas = TextureAtlas.asInstanceOf[js.Any], TextureAtlasPage = TextureAtlasPage.asInstanceOf[js.Any], TextureAtlasRegion = TextureAtlasRegion.asInstanceOf[js.Any], TextureRegion = TextureRegion.asInstanceOf[js.Any], TimeKeeper = TimeKeeper.asInstanceOf[js.Any], TrackEntry = TrackEntry.asInstanceOf[js.Any], TransformConstraint = TransformConstraint.asInstanceOf[js.Any], TransformConstraintData = TransformConstraintData.asInstanceOf[js.Any], TransformConstraintTimeline = TransformConstraintTimeline.asInstanceOf[js.Any], TranslateTimeline = TranslateTimeline.asInstanceOf[js.Any], Triangulator = Triangulator.asInstanceOf[js.Any], TwoColorTimeline = TwoColorTimeline.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], Vector2 = Vector2.asInstanceOf[js.Any], VertexAttachment = VertexAttachment.asInstanceOf[js.Any], WindowedMean = WindowedMean.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], webgl = webgl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofspine]
  }
  
  extension [Self <: Typeofspine](x: Self) {
    
    inline def setAnimation(
      value: (Instantiable3[
          /* name */ String, 
          /* timelines */ js.Array[Timeline], 
          /* duration */ Double, 
          Animation
        ]) & TypeofAnimation
    ): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationState(value: (Instantiable1[/* data */ AnimationStateData, AnimationState]) & TypeofAnimationState): Self = StObject.set(x, "AnimationState", value.asInstanceOf[js.Any])
    
    inline def setAnimationStateAdapter2(value: Instantiable0[AnimationStateAdapter2]): Self = StObject.set(x, "AnimationStateAdapter2", value.asInstanceOf[js.Any])
    
    inline def setAnimationStateData(value: Instantiable1[/* skeletonData */ SkeletonData, AnimationStateData]): Self = StObject.set(x, "AnimationStateData", value.asInstanceOf[js.Any])
    
    inline def setAssetManager(
      value: (Instantiable2[
          /* textureLoader */ js.Function1[/* image */ HTMLImageElement, Any], 
          /* pathPrefix */ js.UndefOr[String], 
          AssetManager
        ]) & TypeofAssetManager
    ): Self = StObject.set(x, "AssetManager", value.asInstanceOf[js.Any])
    
    inline def setAtlasAttachmentLoader(value: Instantiable1[/* atlas */ TextureAtlas, AtlasAttachmentLoader]): Self = StObject.set(x, "AtlasAttachmentLoader", value.asInstanceOf[js.Any])
    
    inline def setAttachment(value: Instantiable1[/* name */ String, Attachment]): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTimeline(value: Instantiable1[/* frameCount */ Double, AttachmentTimeline]): Self = StObject.set(x, "AttachmentTimeline", value.asInstanceOf[js.Any])
    
    inline def setBone(value: Instantiable3[/* data */ BoneData, /* skeleton */ Skeleton, /* parent */ Bone, Bone]): Self = StObject.set(x, "Bone", value.asInstanceOf[js.Any])
    
    inline def setBoneData(value: Instantiable3[/* index */ Double, /* name */ String, /* parent */ BoneData, BoneData]): Self = StObject.set(x, "BoneData", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxAttachment(value: Instantiable1[/* name */ String, BoundingBoxAttachment]): Self = StObject.set(x, "BoundingBoxAttachment", value.asInstanceOf[js.Any])
    
    inline def setCanvas(value: Typeofcanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setClippingAttachment(value: Instantiable1[/* name */ String, ClippingAttachment]): Self = StObject.set(x, "ClippingAttachment", value.asInstanceOf[js.Any])
    
    inline def setColor(
      value: (Instantiable4[
          /* r */ js.UndefOr[Double], 
          /* g */ js.UndefOr[Double], 
          /* b */ js.UndefOr[Double], 
          /* a */ js.UndefOr[Double], 
          Color
        ]) & TypeofColor
    ): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorTimeline(value: (Instantiable1[/* frameCount */ Double, ColorTimeline]) & TypeofColorTimeline): Self = StObject.set(x, "ColorTimeline", value.asInstanceOf[js.Any])
    
    inline def setConstraintData(
      value: Instantiable3[/* name */ String, /* order */ Double, /* skinRequired */ Boolean, ConstraintData]
    ): Self = StObject.set(x, "ConstraintData", value.asInstanceOf[js.Any])
    
    inline def setCurveTimeline(value: (Instantiable1[/* frameCount */ Double, CurveTimeline]) & TypeofCurveTimeline): Self = StObject.set(x, "CurveTimeline", value.asInstanceOf[js.Any])
    
    inline def setDebugUtils(value: Instantiable0[DebugUtils] & TypeofDebugUtils): Self = StObject.set(x, "DebugUtils", value.asInstanceOf[js.Any])
    
    inline def setDeformTimeline(value: Instantiable1[/* frameCount */ Double, DeformTimeline]): Self = StObject.set(x, "DeformTimeline", value.asInstanceOf[js.Any])
    
    inline def setDrawOrderTimeline(value: Instantiable1[/* frameCount */ Double, DrawOrderTimeline]): Self = StObject.set(x, "DrawOrderTimeline", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Instantiable2[/* time */ Double, /* data */ EventData, Event]): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventData(value: Instantiable1[/* name */ String, EventData]): Self = StObject.set(x, "EventData", value.asInstanceOf[js.Any])
    
    inline def setEventQueue(value: Instantiable1[/* animState */ AnimationState, EventQueue]): Self = StObject.set(x, "EventQueue", value.asInstanceOf[js.Any])
    
    inline def setEventTimeline(value: Instantiable1[/* frameCount */ Double, EventTimeline]): Self = StObject.set(x, "EventTimeline", value.asInstanceOf[js.Any])
    
    inline def setFakeTexture(value: Instantiable0[FakeTexture]): Self = StObject.set(x, "FakeTexture", value.asInstanceOf[js.Any])
    
    inline def setIkConstraint(value: Instantiable2[/* data */ IkConstraintData, /* skeleton */ Skeleton, IkConstraint]): Self = StObject.set(x, "IkConstraint", value.asInstanceOf[js.Any])
    
    inline def setIkConstraintData(value: Instantiable1[/* name */ String, IkConstraintData]): Self = StObject.set(x, "IkConstraintData", value.asInstanceOf[js.Any])
    
    inline def setIkConstraintTimeline(value: (Instantiable1[/* frameCount */ Double, IkConstraintTimeline]) & TypeofIkConstraintTimelin): Self = StObject.set(x, "IkConstraintTimeline", value.asInstanceOf[js.Any])
    
    inline def setIntSet(value: Instantiable0[IntSet]): Self = StObject.set(x, "IntSet", value.asInstanceOf[js.Any])
    
    inline def setInterpolation(value: Instantiable0[Interpolation]): Self = StObject.set(x, "Interpolation", value.asInstanceOf[js.Any])
    
    inline def setJitterEffect(value: Instantiable2[/* jitterX */ Double, /* jitterY */ Double, JitterEffect]): Self = StObject.set(x, "JitterEffect", value.asInstanceOf[js.Any])
    
    inline def setMathUtils(value: Instantiable0[MathUtils] & TypeofMathUtils): Self = StObject.set(x, "MathUtils", value.asInstanceOf[js.Any])
    
    inline def setMeshAttachment(value: Instantiable1[/* name */ String, MeshAttachment]): Self = StObject.set(x, "MeshAttachment", value.asInstanceOf[js.Any])
    
    inline def setPathAttachment(value: Instantiable1[/* name */ String, PathAttachment]): Self = StObject.set(x, "PathAttachment", value.asInstanceOf[js.Any])
    
    inline def setPathConstraint(
      value: (Instantiable2[/* data */ PathConstraintData, /* skeleton */ Skeleton, PathConstraint]) & TypeofPathConstraint
    ): Self = StObject.set(x, "PathConstraint", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintData(value: Instantiable1[/* name */ String, PathConstraintData]): Self = StObject.set(x, "PathConstraintData", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintMixTimeline(
      value: (Instantiable1[/* frameCount */ Double, PathConstraintMixTimeline]) & TypeofPathConstraintMixTi
    ): Self = StObject.set(x, "PathConstraintMixTimeline", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintPositionTimeline(
      value: (Instantiable1[/* frameCount */ Double, PathConstraintPositionTimeline]) & TypeofPathConstraintPosit
    ): Self = StObject.set(x, "PathConstraintPositionTimeline", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintSpacingTimeline(value: Instantiable1[/* frameCount */ Double, PathConstraintSpacingTimeline]): Self = StObject.set(x, "PathConstraintSpacingTimeline", value.asInstanceOf[js.Any])
    
    inline def setPointAttachment(value: Instantiable1[/* name */ String, PointAttachment]): Self = StObject.set(x, "PointAttachment", value.asInstanceOf[js.Any])
    
    inline def setPool(
      value: Instantiable1[
          /* instantiator */ js.Function0[/* import warning: RewrittenClass.unapply cls was tparam T */ Any], 
          Pool[js.Object]
        ]
    ): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
    
    inline def setPow(value: Instantiable1[/* power */ Double, Pow]): Self = StObject.set(x, "Pow", value.asInstanceOf[js.Any])
    
    inline def setPowOut(value: Instantiable1[/* power */ Double, PowOut]): Self = StObject.set(x, "PowOut", value.asInstanceOf[js.Any])
    
    inline def setRegionAttachment(value: (Instantiable1[/* name */ String, RegionAttachment]) & TypeofRegionAttachment): Self = StObject.set(x, "RegionAttachment", value.asInstanceOf[js.Any])
    
    inline def setRotateTimeline(value: (Instantiable1[/* frameCount */ Double, RotateTimeline]) & TypeofRotateTimeline): Self = StObject.set(x, "RotateTimeline", value.asInstanceOf[js.Any])
    
    inline def setScaleTimeline(value: Instantiable1[/* frameCount */ Double, ScaleTimeline]): Self = StObject.set(x, "ScaleTimeline", value.asInstanceOf[js.Any])
    
    inline def setSharedAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], SharedAssetManager]): Self = StObject.set(x, "SharedAssetManager", value.asInstanceOf[js.Any])
    
    inline def setShearTimeline(value: Instantiable1[/* frameCount */ Double, ShearTimeline]): Self = StObject.set(x, "ShearTimeline", value.asInstanceOf[js.Any])
    
    inline def setSkeleton(value: Instantiable1[/* data */ SkeletonData, Skeleton]): Self = StObject.set(x, "Skeleton", value.asInstanceOf[js.Any])
    
    inline def setSkeletonBinary(
      value: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonBinary]) & TypeofSkeletonBinary
    ): Self = StObject.set(x, "SkeletonBinary", value.asInstanceOf[js.Any])
    
    inline def setSkeletonBounds(value: Instantiable0[SkeletonBounds]): Self = StObject.set(x, "SkeletonBounds", value.asInstanceOf[js.Any])
    
    inline def setSkeletonClipping(value: Instantiable0[SkeletonClipping] & TypeofSkeletonClipping): Self = StObject.set(x, "SkeletonClipping", value.asInstanceOf[js.Any])
    
    inline def setSkeletonData(value: Instantiable0[SkeletonData]): Self = StObject.set(x, "SkeletonData", value.asInstanceOf[js.Any])
    
    inline def setSkeletonJson(value: (Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson]) & TypeofSkeletonJson): Self = StObject.set(x, "SkeletonJson", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Instantiable1[/* name */ String, Skin]): Self = StObject.set(x, "Skin", value.asInstanceOf[js.Any])
    
    inline def setSkinEntry(
      value: Instantiable3[/* slotIndex */ Double, /* name */ String, /* attachment */ Attachment, SkinEntry]
    ): Self = StObject.set(x, "SkinEntry", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: Instantiable2[/* data */ SlotData, /* bone */ Bone, Slot]): Self = StObject.set(x, "Slot", value.asInstanceOf[js.Any])
    
    inline def setSlotData(value: Instantiable3[/* index */ Double, /* name */ String, /* boneData */ BoneData, SlotData]): Self = StObject.set(x, "SlotData", value.asInstanceOf[js.Any])
    
    inline def setSwirlEffect(value: (Instantiable1[/* radius */ Double, SwirlEffect]) & TypeofSwirlEffect): Self = StObject.set(x, "SwirlEffect", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: (Instantiable1[/* image */ HTMLImageElement, Texture]) & TypeofTexture): Self = StObject.set(x, "Texture", value.asInstanceOf[js.Any])
    
    inline def setTextureAtlas(
      value: Instantiable2[
          /* atlasText */ String, 
          /* textureLoader */ js.Function1[/* path */ String, Any], 
          TextureAtlas
        ]
    ): Self = StObject.set(x, "TextureAtlas", value.asInstanceOf[js.Any])
    
    inline def setTextureAtlasPage(value: Instantiable0[TextureAtlasPage]): Self = StObject.set(x, "TextureAtlasPage", value.asInstanceOf[js.Any])
    
    inline def setTextureAtlasRegion(value: Instantiable0[TextureAtlasRegion]): Self = StObject.set(x, "TextureAtlasRegion", value.asInstanceOf[js.Any])
    
    inline def setTextureRegion(value: Instantiable0[TextureRegion]): Self = StObject.set(x, "TextureRegion", value.asInstanceOf[js.Any])
    
    inline def setTimeKeeper(value: Instantiable0[TimeKeeper]): Self = StObject.set(x, "TimeKeeper", value.asInstanceOf[js.Any])
    
    inline def setTrackEntry(value: Instantiable0[TrackEntry]): Self = StObject.set(x, "TrackEntry", value.asInstanceOf[js.Any])
    
    inline def setTransformConstraint(
      value: Instantiable2[/* data */ TransformConstraintData, /* skeleton */ Skeleton, TransformConstraint]
    ): Self = StObject.set(x, "TransformConstraint", value.asInstanceOf[js.Any])
    
    inline def setTransformConstraintData(value: Instantiable1[/* name */ String, TransformConstraintData]): Self = StObject.set(x, "TransformConstraintData", value.asInstanceOf[js.Any])
    
    inline def setTransformConstraintTimeline(
      value: (Instantiable1[/* frameCount */ Double, TransformConstraintTimeline]) & TypeofTransformConstraint
    ): Self = StObject.set(x, "TransformConstraintTimeline", value.asInstanceOf[js.Any])
    
    inline def setTranslateTimeline(value: (Instantiable1[/* frameCount */ Double, TranslateTimeline]) & TypeofTranslateTimeline): Self = StObject.set(x, "TranslateTimeline", value.asInstanceOf[js.Any])
    
    inline def setTriangulator(value: Instantiable0[Triangulator] & TypeofTriangulator): Self = StObject.set(x, "Triangulator", value.asInstanceOf[js.Any])
    
    inline def setTwoColorTimeline(value: (Instantiable1[/* frameCount */ Double, TwoColorTimeline]) & TypeofTwoColorTimeline): Self = StObject.set(x, "TwoColorTimeline", value.asInstanceOf[js.Any])
    
    inline def setUtils(value: Instantiable0[Utils] & TypeofUtils): Self = StObject.set(x, "Utils", value.asInstanceOf[js.Any])
    
    inline def setVector2(value: Instantiable2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Vector2]): Self = StObject.set(x, "Vector2", value.asInstanceOf[js.Any])
    
    inline def setVertexAttachment(value: (Instantiable1[/* name */ String, VertexAttachment]) & TypeofVertexAttachment): Self = StObject.set(x, "VertexAttachment", value.asInstanceOf[js.Any])
    
    inline def setWebgl(value: Typeofwebgl): Self = StObject.set(x, "webgl", value.asInstanceOf[js.Any])
    
    inline def setWindowedMean(value: Instantiable1[/* windowSize */ js.UndefOr[Double], WindowedMean]): Self = StObject.set(x, "WindowedMean", value.asInstanceOf[js.Any])
  }
}
